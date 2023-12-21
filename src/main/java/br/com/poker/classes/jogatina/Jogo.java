package br.com.poker.classes.jogatina;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

import br.com.poker.classes.atores.Jogador;
import br.com.poker.classes.atores.Pessoa;
import br.com.poker.classes.menus.MensagensJogo;
import br.com.poker.classes.objetos.Baralho;

public class Jogo {
    
    private Jogador jogadores[] = new Jogador[8];
    private List<Rodada> rodadas = new ArrayList<Rodada>();
    private Baralho baralho = new Baralho();
    private Pessoa vencedor;

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
                
                System.out.println("PROGRAMA ENCERRADO!");
                break;

            } else if(quantidadeJogadores < 0) {
                MensagensJogo.limpaConsole();
                MensagensJogo.exibeMenuQuantidadeJogadores();

                System.out.println("ESCOLHA UMA DAS OPCOES ACIMA!\n");

            } else {
                break;
            }

        } while(true);

        return quantidadeJogadores;
    }

    public void iniciarLobby() throws IOException, InterruptedException{
        this.getQuantidadeJogadores();
    }
    
    public void inciarJogo() {

    }

    public void run() throws IOException, InterruptedException{
        this.iniciarLobby();
    }
}
