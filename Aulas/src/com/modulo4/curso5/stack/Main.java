package com.modulo4.curso5.stack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);
        System.out.println(stackCarros.peek()); // Igual ao Pop
        System.out.println(stackCarros);

        System.out.println(stackCarros.isEmpty());




    }
}
