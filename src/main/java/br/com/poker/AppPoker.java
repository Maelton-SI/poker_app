package br.com.poker;

import java.io.IOException;

import br.com.poker.classes.jogatina.Jogo;

public class AppPoker {
    public static void main(String[] args) throws IOException, InterruptedException{
        
        new Jogo().run();
    }
}