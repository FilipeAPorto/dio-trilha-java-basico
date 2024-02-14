package com.desafios.modulo2;

import java.util.Scanner;

public class EntradaNomes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] nomes = new String[10];

        for (int i = 0; i < nomes.length; i++) {
           // System.out.println("Escreva o " + (i + 1) + "º nome sem espaço."); Teste
            nomes[i] = scan.next();
        }

        System.out.println(nomes[2]);
        System.out.println(nomes[6]);
        System.out.println(nomes[8]);
    }
}
