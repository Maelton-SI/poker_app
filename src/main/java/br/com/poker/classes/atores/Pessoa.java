package br.com.poker.classes.atores;

public class Pessoa {
    
    private String email;
    private String nome;
    private Double dinheiro;
    private int fichas;
    
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDinheiro() {
        return this.dinheiro;
    }

    public void setDinheiro(Double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getFichas() {
        return this.fichas;
    }

    public void setFichas(int fichas) {
        this.fichas = fichas;
    }
    
    public Pessoa(String email, String nome, Double dinheiro, int fichas) {
        this.email = email;
        this.nome = nome;
        this.dinheiro = dinheiro;
        this.fichas = fichas;
    }
}
