package br.com.poker.classes.menus;

import java.io.IOException;

public class MensagensJogo {

    public static void limpaConsole() throws IOException, InterruptedException {

        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    }
    
    public static void exibeMenuQuantidadeJogadores() {
        
        System.out.println("=====================================");
        System.out.println("| ESCOLHA A QUANTIDADE DE JOGADORES |");
        System.out.println("|                                   |");
        System.out.println("| 1 - DOIS JOGADORES                |");
        System.out.println("| 2 - TRES JOGADORES                |");
        System.out.println("| 3 - QUATRO JOGADORES              |");
        System.out.println("| 4 - CINCO JOGADORES               |");
        System.out.println("| 5 - SEIS JOGADORES                |");
        System.out.println("| 6 - SETE JOGADORES                |");
        System.out.println("| 7 - OITO JOGADORES                |");
        System.out.println("|                                   |");
        System.out.println("| 0 - SAIR                          |");
        System.out.println("=====================================\n");
    }
}
