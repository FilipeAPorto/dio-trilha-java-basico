package com.modulo4.curso6.set;

import java.util.*;

public class ExemploSet { // SET NÃO ACEITA ELEMENTOS DUPLICADOS E NÃO POSSUI INDICE
    public static void main(String[] args) {

        Set<Double> notas = new HashSet<>();

        System.out.println("Crie um conunto e adicione 7 notas: ");
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        //Número 7 esta adcionado 2 vezes porem so o ultimo realmente foi adicionado, pois set não aceita elementos duplicados.
        System.out.println(notas);

        /*
        System.out.println("Exiba a posição da nota 5.0");
        System.out.println("\nAdicione na lista a nota 8.0 na posição 4:");
        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0 : ");
        System.out.println("Exiba a terceira nota adicionada : ");
        System.out.println("Remova a nota da posição 0 : ");
        ** Não existe forma de indexof no SET, ele não aceita indice, logo não da pra procurar por posição. **
         */

        System.out.println("\nConfira se a nota 5.0 esta na lista :" + notas.contains(5d));

        System.out.println("Exiba a menor nota : " + Collections.min(notas));

        System.out.println("Exiba a maior nota : " + Collections.max(notas));

        System.out.println("Exiba a soma dos valors : " + somarValores(notas));

        System.out.println("Exiba a média das notas :" + somarValores(notas) / notas.size());

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista : " );
        double notaRemover = 7; // Criei uma variavel para atribuir o valor 7, porem pode utilizar Scan.

        removerValores(notaRemover, notas);
        System.out.println(notas);




        /*







*/


    }

    private static double somarValores(Set<Double> notas) {
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;

        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        return soma;
    }

    private static void removerValores(double nota, Set<Double> notas) {
        Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()) {
            Double next = iterator.next();
            if (next < nota) {
                iterator.remove();
            }
        }
    }

}
