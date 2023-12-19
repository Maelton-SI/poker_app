package br.com.poker.entidades;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Baralho de cartas.
 * 
 * @author Maelton Lima
 */
public class Baralho {
    
    Deque<Carta> cartas;

    public Carta geraCarta(Simbolo simbolo, Naipe naipe) {

        return new Carta(simbolo, naipe);
    };

    /**
     * Gera e retorna um ArrayDeque<Carta>, com a ordem adotada:
     * 
     * Simbolos do A ao 2: (A, K, Q, J, 10, 9, 8, 7, 6, 5, 4, 3, 2)
     * Naipes: COPAS, PAUS, OUROS, ESPADAS
     * 
     * @return cartas
     */
    public Deque<Carta> geraBaralhoDeCartasOrdenadas() {
        
        Deque<Carta> cartas = new ArrayDeque<Carta>();

        for(Naipe naipe : Naipe.values()) {
            for(Simbolo simbolo : Simbolo.values()) {

                cartas.addFirst( (this.geraCarta(simbolo, naipe) ) );
            }
        }

        return  cartas;
    };

    @Override
    public String toString() {
        return this.cartas.toString();
    }

    public Baralho() {
        this.cartas = this.geraBaralhoDeCartasOrdenadas();
    }
}
