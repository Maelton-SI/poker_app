package br.com.poker.classes.atores;

import br.com.poker.interfaces.PessoaJogando;

public class Jogador implements PessoaJogando{

    private String email;
    private String nome;
    private int stack;

    public String getEmail() {
        return this.email;
    }

    public String getNome() {
        return this.nome;
    }

    public int getStack() {
        return this.stack;
    }

    public void setEmail(Pessoa pessoa) {
        this.email = pessoa.getEmail();
    }

    public void setNome(Pessoa pessoa) {
        this.nome = pessoa.getNome();
    }
    
    @Override
    public void fold() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fold'");
    }

    @Override
    public void check() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'check'");
    }

    @Override
    public void call() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'call'");
    }

    @Override
    public void bet() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'bet'");
    }

    @Override
    public void raise() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'raise'");
    }

    public Jogador(Pessoa pessoa, int stack) {
        this.email = pessoa.getEmail();
        this.nome = pessoa.getNome();
        this.stack = stack;
    }
    
}
