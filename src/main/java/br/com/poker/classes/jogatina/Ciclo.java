package br.com.poker.classes.jogatina;

import br.com.poker.classes.objetos.Baralho;
import br.com.poker.classes.objetos.Carta;
import br.com.poker.interfaces.Dealer;
import br.com.poker.interfaces.PossuiCartas;
import br.com.poker.classes.atores.Jogador;

public class Ciclo implements PossuiCartas, Dealer {

    private Jogador jogadores[] = new Jogador[8];
    private Carta cartasComunitarias[] = new Carta[5];
    private byte quantidadeCartasComunitarias = 0;
    private int pote;
    
    @Override
    public void addCarta(Carta carta) {
        this.cartasComunitarias[quantidadeCartasComunitarias] = carta;
        this.quantidadeCartasComunitarias++;
    }

    @Override
    public void executaEntregaDeCarta(Carta carta, Jogador jogador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executaEntregaCarta'");
    }

    @Override
    public void executaDistribuicaoCartas(Baralho baralho, Jogador[] jogadores) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executaDistribuicaoCartas'");
    }

    @Override
    public void executaFlop(Baralho baralho) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executaFlop'");
    }

    @Override
    public void executaTurn(Baralho baralho) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executaTurn'");
    }

    @Override
    public void executaRiver(Baralho baralho) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executaRiver'");
    }

    public void iniciarCiclo() {

    }

    public Ciclo(Jogador[] jogadores) {
        this.jogadores = jogadores;
        this.iniciarCiclo();
    }
}
