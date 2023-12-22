package br.com.poker.classes.jogatina;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

import br.com.poker.classes.atores.Jogador;
import br.com.poker.classes.atores.Pessoa;
import br.com.poker.classes.menus.MensagensJogo;
import br.com.poker.classes.objetos.Baralho;
import br.com.poker.temp_database.TempPessoas;

public class Partida {
    
    private Jogador mesaDeJogadores[] = new Jogador[8];
    private byte quantidadeJogadoresNaMesa = 0;
    private List<Rodada> rodadas = new ArrayList<Rodada>();
    private Baralho baralho = new Baralho();
    private Pessoa vencedor;
    private int buyIn;

    public void addRodada(Rodada rodada) {
        this.rodadas.add(rodada);
    }

    public void resetMesaDeJogadores() {
        this.mesaDeJogadores = new Jogador[8];
        this.quantidadeJogadoresNaMesa = 0;
    }

    public int getBuyIn() {
        return buyIn;
    }

    public void setBuyIn(int buyIn) {
        this.buyIn = buyIn;
    }

    public Jogador[] getJogadores() {
        return this.mesaDeJogadores;
    }

    public byte getQuantidadeJogadoresNaMesa() {
        return quantidadeJogadoresNaMesa;
    }

    public void addJogador(byte indiceInsercao, Jogador jogador) {
        this.mesaDeJogadores[indiceInsercao] = jogador;
        this.quantidadeJogadoresNaMesa++;
    } 

    /**
     * Retorna a quantidade de jogadores que irão participar de uma partida.
     * 
     * @return quantidadeJogadores
     * @throws IOException
     * @throws InterruptedException
     */
    public byte getQuantidadeJogadores() throws IOException, InterruptedException {
        
        Scanner scan = new Scanner(System.in);
        String escolhaOpcaoMenu;
        byte quantidadeJogadores;

        MensagensJogo.exibeMenuQuantidadeJogadores();
        
        do {
            System.out.print("> ");
            escolhaOpcaoMenu = scan.nextLine();

            quantidadeJogadores = switch (escolhaOpcaoMenu) {
                case "0" -> 0;
                case "1" -> 2;
                case "2" -> 3;
                case "3" -> 4;
                case "4" -> 5;
                case "5" -> 6;
                case "6" -> 7;
                case "7" -> 8;
                default -> -1;
            };

            if(quantidadeJogadores == 0) {
                
                MensagensJogo.limpaConsole();
                MensagensJogo.exibeMensagemJogoEncerrado();
                break;

            } else if(quantidadeJogadores < 0) {
                MensagensJogo.limpaConsole();
                MensagensJogo.exibeMenuQuantidadeJogadores();

                System.out.println("ESCOLHA UMA DAS OPCOES ACIMA!\n");

            } else {
                MensagensJogo.limpaConsole();
                break;
            }

        } while(true);

        return quantidadeJogadores;
    }

    public void exibeJogadores() {

        if(this.quantidadeJogadoresNaMesa > 0) {

            System.out.println("===================================");
            System.out.println("         JOGADORES NA MESA         \n");
            
            for(byte numeroJogador = 0; 
                numeroJogador < this.quantidadeJogadoresNaMesa; 
                numeroJogador++) {
                    
                    System.out.println(
                                    (numeroJogador+1) + 
                                    " - " + 
                                    this.mesaDeJogadores[numeroJogador].getNome());
            }

            System.out.println("\n===================================\n");
        }
    }

    public byte iniciarLobby() throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        byte quantidadeJogadores = this.getQuantidadeJogadores();

        if(quantidadeJogadores == 0) {
            return -1; //encerrar jogo
        }

        for(byte jogador = 0; jogador < quantidadeJogadores; jogador++) {

            MensagensJogo.limpaConsole();
            this.exibeJogadores();

            System.out.print("Email do " + (jogador+1) + "º jogador: ");
            String emailJogador = scanner.nextLine();

            this.addJogador(jogador, this.criarJogador( TempPessoas.getPessoa(emailJogador) ));
        }

        MensagensJogo.limpaConsole();
        this.exibeJogadores();
        MensagensJogo.exibeMensagemOpcoesLobby();
        
        do { 
            System.out.print("> ");
            String escolhaOpcaoLobby = scanner.nextLine();
            byte encerramentoDeLobby = switch(escolhaOpcaoLobby) {
                case "1" -> 1; //iniciar partida
                case "2" -> 0; //voltar ao lobby
                default -> -1; //digitar caractere valido
            };

            if(encerramentoDeLobby == -1) {
                MensagensJogo.limpaConsole();
                this.exibeJogadores();
                MensagensJogo.exibeMensagemOpcoesLobby();
                
                System.out.println("ESCOLHA UMA DAS OPCOES ACIMA!\n");
            } else {
                return encerramentoDeLobby;
            }
        } while(true);
    }

    public Jogador criarJogador(Pessoa pessoa) {
        return new Jogador(pessoa, this.getBuyIn());
    }
    
    public void iniciarPartida() {
        
        System.out.println("\nPartida inciando...");

        while(this.vencedor != null) {
            Rodada rodada = new Rodada( this.getJogadores() );
            this.addRodada(rodada);
        }
    }

    public void run() throws IOException, InterruptedException{
        while(true) {
            byte statusPartida = this.iniciarLobby();

            if(statusPartida == -1) {
                MensagensJogo.limpaConsole();
                MensagensJogo.exibeMensagemJogoEncerrado();
                break;

            } else if(statusPartida == 0) {
                MensagensJogo.limpaConsole();
                this.resetMesaDeJogadores();

            } else if(statusPartida == 1) {
                this.iniciarPartida();
                break;
            }
        }
    }
}
