package br.com.poker.entidades;

public class Carta {

    Simbolo simbolo;
    Naipe naipe;

    @Override
    public String toString() {
        return simbolo.getRepresentacaoSimbolo() + naipe.getRepresentacaoNaipe();
    }

    public Carta(Simbolo simboloCarta, Naipe naipeCarta) {
        this.simbolo = simboloCarta;
        this.naipe = naipeCarta;
    }
}