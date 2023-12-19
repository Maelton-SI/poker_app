package br.com.poker.entidades;

/**
 * Enum com os naipes possíveis de uma carta.
 * 
 * @author Maelton Lima
 */
public enum Naipe {
    
    COPAS( 'c'), 
    PAUS('p'), 
    OUROS('o'),
    ESPADAS('e');

    char representacaoNaipe;
    
    public char getRepresentacaoNaipe() {
        return representacaoNaipe;
    };

    private Naipe(char representacaoNaipe) {
        this.representacaoNaipe = representacaoNaipe;
    };
}
