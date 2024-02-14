package com.modulo3.curso2.pilares_poo.encapsulamento;

public class Carro {

    /*
    Encapsulamento é colocar metodos, atributos que não tem necessidade de ser chamado na classe Drive dentro de um único metodo Public,
    tornando esses metodos private. Serve para esconder informações e para otimizar o processo
    (Não só metodos, atributos como get e set tbm).
     */

    public void ligar(){

        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado");
    }

    private void confereCombustivel(){ //aqui
        System.out.println("Conferindo combustivel");
    }

    private void confereCambio(){ //aqui
        System.out.println("Conferindo cambio em P");
    }

}
