package com.modulo4.curso1.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {

        int intA = 1;
        int intB = intA; // Atribuição de Tipos primitivos, copia o valor que esta na memória

        System.out.println("intA = " + intA + " - intB = " + intB);

        intA = 2;

        System.out.println("intA = " + intA + " - intB = " + intB);

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;// Atribuição de Objetos, copia o valor da referencia de memoria,
        // logo o objB é o objA , pois foi copiado o local aonde esta salvo e nao o valor atribuido a ele

        System.out.println("objA = " + objA + " - objB = " + objB);

        objA.setNum(2);

        System.out.println("objA = " + objA + " - objB = " + objB);


    }
}
