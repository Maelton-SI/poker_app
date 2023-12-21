package br.com.poker.classes.objetos;

/**
 * Enum com os simbolos possíveis de uma carta.
 * 
 * @author Maelton Lima
 */
public enum Simbolo {
    A( (byte) 14),
    K( (byte) 13),
    Q( (byte) 12),
    J( (byte) 11),
    DEZ( (byte) 10),
    NOVE( (byte) 9),
    OITO( (byte) 8),
    SETE( (byte) 7),
    SEIS( (byte) 6),
    CINCO( (byte) 5),
    QUATRO( (byte) 4),
    TRES( (byte) 3),
    DOIS( (byte) 2);

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
