package com.modulo3.curso1.construtores;

public class Pessoa {

    private String nome,cpf,endereco;

    /*
    Para criar um Costrutor, quais são os atributos necessarios para a criação da classe em questão,
    nesse exemplo temos o Nome e CPF como essênciais, logo eles serão solicitados no costrutor e não por Setters
    Não usar todos os atributos no construtor, isso é uma má pratica e pode dar problemas depois.
     */
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
