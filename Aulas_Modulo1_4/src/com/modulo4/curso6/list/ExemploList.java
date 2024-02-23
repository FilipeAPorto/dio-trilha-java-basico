package com.modulo4.curso6.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<>();

        System.out.println("Crie uma lista e adicione as sete notas :");
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas);

        System.out.println("\nExiba a posição da nota 5.0:");
        System.out.println(notas.indexOf(5.0));

        System.out.println("\nAdicione na lista a nota 8.0 na posição 4:");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0 : ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        System.out.println("\nConfira se a nota 5.0 esta na lista :");
        System.out.println(notas.contains(5.0));

        System.out.println("\nExiba todas as notas na ordem em que foram informados : ");
        for (Double nota : notas) {
            System.out.println(nota);
        }

        System.out.println("Exiba a terceira nota adicionada : " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota : " + Collections.min(notas));

        System.out.println("Exiba a maior nota : " + Collections.max(notas));

        System.out.print("Exiba a soma dos valors : ");
        /* ***Codigo para somar os valores é esta de baixo, porem eu ja implementei elas em um metodo.
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;

        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }        */
        System.out.println(somarValores(notas));

        System.out.println("Exiba a média das notas : " + (somarValores(notas) / notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d); // Se colocar um valor inteiro (int) vai remover a nota da posição 0(zero),
        // então coloque o double, caso a lista seja Double
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0); // Se colocar um valor double vai remover a nota e não a posição então coloque o int.
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista : ");
        double notaRemover = 7; // Criei uma variavel para atribuir o valor 7, porem pode utilizar Scan

        /* ***Codigo para remover os valores é esta de baixo, porem eu ja implementei elas em um metodo.
       Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()) {
            Double next = iterator.next();
            if(next < nota){
                iterator.remove();
            }
        }         */
        removerValores(notaRemover, notas);
        System.out.println(notas);

        System.out.println("Apage toda a lista : ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista esta vazia : " + notas.isEmpty());
    }

    private static double somarValores(List<Double> notas) {
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;

        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        return soma;
    }

    private static void removerValores(double nota, List<Double> notas) {
        Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()) {
            Double next = iterator.next();
            if (next < nota) {
                iterator.remove();
            }
        }
    }
}
