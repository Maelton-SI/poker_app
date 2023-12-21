package br.com.poker;

import java.io.IOException;

import br.com.poker.classes.jogatina.Partida;

public class AppPoker {
    public static void main(String[] args) throws IOException, InterruptedException{
        
        new Partida().run();
    }
}