package com.modulo3.curso1.enum_;

public enum EstadoBrasileiro {

    /*
    Diferente de classes constantes aonde se tem váriaveis ,enum são um conjunto de objetos ,criado para valores pré establecidos
    que não sofre alteração constantemente (Ex: Numero de estados brasileiros) com a possibilidade de criação de metodos,
    getter e setter, contrutores.
     */

    SAO_PAULO("SP", "São Paulo", 11),
    RIO_JANEIRO("RJ", "Rio de Janeiro", 12),
    PIAUI("PI", "Piauí", 13),
    MARANHAO("MA", "Maranhão", 14),
    CEARA("CE", "Ceará", 15);


    private String nome;
    private String sigla;
    private int ibge;


    EstadoBrasileiro(String nome, String sigla, int ibge) {
        this.nome = nome;
        this.sigla = sigla;
        this.ibge = ibge;
    }

    public int getIbge() {
        return ibge;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
