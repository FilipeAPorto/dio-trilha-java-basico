package com.modulo4.curso6.list.labs.exer01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Temperatura> temperaturas = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {
            while (true) {
                try {
                    System.out.print("Insira a temperatura média do mês " + (i + 1) + " : ");
                    String entrada = scan.nextLine();
                    entrada = entrada.replaceAll(",", ".");
                    temperaturas.add(new Temperatura(Double.parseDouble(entrada), i));
                    break;

                } catch (Exception e) {
                    System.out.println("\n*** ERRO - Caractere inválido inserido ***\n");
                }
            }
        }

        System.out.println(temperaturas);
        System.out.printf("Médias das temperaturas dos meses - %.1f",somarValores(temperaturas) / temperaturas.size());
        System.out.print("º");
    }

    private static double somarValores(List<Temperatura> Temperatura) {
        Iterator<Temperatura> iterator = Temperatura.iterator();
        int i = 0;
        double soma = 0d;

        while (iterator.hasNext()) {
            soma += Temperatura.get(i).getValorTemperatura();
            iterator.next();
            i++;
        }
        return soma;
    }
}
