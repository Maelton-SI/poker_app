package br.com.poker.classes.jogatina;

import java.util.ArrayList;
import java.util.List;

import br.com.poker.classes.atores.Jogador;

public class Rodada {
    
    private List<Ciclo> ciclos = new ArrayList<Ciclo>();
    private Jogador jogadores[] = new Jogador[8];
    private Jogador vencedor;

    public void addCiclo(Ciclo ciclo) {
        this.ciclos.add(ciclo);
    }

    public Jogador[] getJogadores() {
        return this.jogadores;
    }

    public void inciarRodada(Jogador[] jogadores) {
        
        while(this.vencedor != null) {
            Ciclo ciclo = new Ciclo( this.getJogadores() );
            this.addCiclo(ciclo);
        }
    }

    public Rodada(Jogador[] jogadores) {
        this.jogadores = jogadores;
        this.inciarRodada(this.jogadores);
    }
}
