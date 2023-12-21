package br.com.poker.temp_database;

import br.com.poker.classes.atores.Pessoa;

public class TempPessoas {
    
    public final static Pessoa pessoas[] = {
        new Pessoa("wladia@ifal.edu.br", "Wladia Bessa", 1_000.00, 0),
        new Pessoa("ivo.calado@ifal.edu.br", "Ivo Calado", 1_000.00, 0),
        new Pessoa("ricardo@ifal.edu.br", "Ricardo Rubens", 1_000.00, 0),
        new Pessoa("fred@ifal.edu.br", "José Frederico", 1_000.00, 0),
        new Pessoa("leonardo.medeiros@ifal.edu.br", "Leonardo Medeiros", 1_000.00, 0),
        new Pessoa("edison@ifal.edu.br", "Edison Camilo", 1_000.00, 0),
        new Pessoa("flavio@ifal.edu.br", "Flávio Melo", 1_000.00, 0),
        new Pessoa("fabrisa@ifal.edu.br", "Fabrisia", 1_000.00, 0)
    };

    public static Pessoa getPessoa(String email) {
        for(Pessoa pessoa : pessoas) {
            if (email.equals(pessoa.getEmail())) {
                return pessoa;
            }
        }

        return new Pessoa("default@mail.com", "Default", 1_000.00, 0);
    }
}
