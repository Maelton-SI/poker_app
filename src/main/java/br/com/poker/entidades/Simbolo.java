package br.com.poker.entidades;

/**
 * Enum com os simbolos possíveis de uma carta.
 * 
 * @author Maelton Lima
 */
public enum Simbolo {
    
    
    DOIS( (byte) 2),
    TRES( (byte) 3),
    QUATRO( (byte) 4),
    CINCO( (byte) 5),
    SEIS( (byte) 6),
    SETE( (byte) 7),
    OITO( (byte) 8),
    NOVE( (byte) 9),
    DEZ( (byte) 10),
    J( (byte) 11),
    Q( (byte) 12),
    K( (byte) 13),
    A( (byte) 14);

    byte valorSimbolo;

    /**
     * 
     * @return Um dos valores: A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K
     */
    public String getRepresentacaoSimbolo() {
        return this.valorSimbolo > 10 ? name() : Byte.toString(valorSimbolo);
    };

    public byte getValorSimbolo() {
        return valorSimbolo;
    };

    private Simbolo(byte valorSimbolo) {
        this.valorSimbolo = valorSimbolo;
    }

}
