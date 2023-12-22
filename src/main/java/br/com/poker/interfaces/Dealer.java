package br.com.poker.interfaces;

import br.com.poker.classes.atores.Jogador;
import br.com.poker.classes.objetos.Baralho;
import br.com.poker.classes.objetos.Carta;

public interface Dealer {
    
    void executaEntregaDeCarta(Carta carta, Jogador jogador);
    void executaDistribuicaoCartas(Baralho baralho, Jogador[] jogadores);
    void executaFlop(Baralho baralho);
    void executaTurn(Baralho baralho);
    void executaRiver(Baralho baralho);
}
