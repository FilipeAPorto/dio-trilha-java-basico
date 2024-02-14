package com.modulo3.curso1.construtores;

public class SistemaCadastro {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Juão","695.984.621-74");

        pessoa.setEndereco("Rua Avila Salgueiro Filho - 321");


        System.out.println("Nome : " + pessoa.getNome());
        System.out.println("CPF : " + pessoa.getCpf());
        System.out.println("CEP " + pessoa.getEndereco());

    }
}
