package br.com.poker.classes.objetos;

import java.security.SecureRandom;

/**
 * Baralho de cartas.
 * 
 * @author Maelton Lima
 */
public class Baralho {
    private Carta cartas[];

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
    public Carta[] geraBaralhoOrdenado() {
        
        Carta cartas[] = new Carta[52];
        byte indexDeInsercao = 0;

        for(Naipe naipe : Naipe.values()) {
            for(Simbolo simbolo : Simbolo.values()) {

                cartas[indexDeInsercao] = this.geraCarta(simbolo, naipe);
                indexDeInsercao++;
            }
        }

        return cartas;
    };

    /**
     * FISHER-YATES SHUFFLE (VERSÃO MODERNA)
     * 
     * Para embaralhar um array a de n elementos (índices 0.. n -1):
     *     
     * para  i  de  n −1 até 1 , faça 
     *     j ← inteiro aleatório tal que 0 ≤ j ≤ i 
     *     troque a [ j ] e a [ i ]
     */
    public void embaralhaCartas() {
        SecureRandom random = new SecureRandom();

        for (int k=2; k>0; k--)
        for(int i = 51; i>0; i--) {
            int j = random.nextInt(0, i+1);

            Carta temp = this.cartas[j];

            this.cartas[j] = this.cartas[i];
            this.cartas[i] = temp;
        }
    }

    @Override
    public String toString() {
        String baralho = "{";

        for(Carta carta : this.cartas) {
            baralho += carta.toString() + ", ";
        }

        return baralho.substring(0, baralho.length()-2) + "}";
    }

    public Baralho() {
        this.cartas = this.geraBaralhoOrdenado();
    }
}
