package com.modulo4.curso6.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoLista {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>();
        meusGatos.add(new Gato("Jon", 18, "preto"));
        meusGatos.add(new Gato("Simba", 6, "tigrado"));
        meusGatos.add(new Gato("Nina", 4, "amarelo"));

        /*List<Gato> meusGatos = new ArrayList<>() {{ OUTRA FORMA DE CRIAR A LISTA
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Nina", 4, "amarelo"));
        }};*/

        System.out.println("--- Ordem de Inserção ---");
        System.out.println(meusGatos);

        System.out.println("--- Ordem aleatória ---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--- Ordem Natural (Nome) ---");
        // Para organizar de forma natural , a classe instanciada necessita
        // implementar a interface Comparable<class>
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--- Ordem Idade ---");
        // Caso ja tenha utilizado o Comparable para realizar alguma ordenação e necessite de uma segunda ordenação
        //usar a interface comparator criando um metodo para ele
        meusGatos.sort(new ComparatorIdade());
        //Collections.sort(meusGatos,new ComparatorIdade() ); // das 2 formas da certo, tanto essa quanto o de cima

        System.out.println(meusGatos);

        System.out.println("--- Ordem Cor ---");
        // Caso ja tenha utilizado o Comparable para realizar alguma ordenação e necessite de uma segunda ordenação
        //usar a interface comparator criando um metodo para ele
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("--- Ordem Nome/Cor/Idade ---");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }

    private static class Gato implements Comparable<Gato> {
        private String nome;
        private int idade;
        private String cor;

        public Gato(String nome, Integer idade, String cor) {
            this.nome = nome;
            this.idade = idade;
            this.cor = cor;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public Integer getIdade() {
            return idade;
        }

        public void setIdade(Integer idade) {
            this.idade = idade;
        }

        @Override
        public int compareTo(Gato gato) {
            return this.getNome().compareToIgnoreCase(gato.getNome());
        }

        @Override
        public String toString() {
            return "Gato{" + "nome='" + nome + '\'' + ", idade=" + idade + ", cor='" + cor + '\'' + '}';
        }
    }

    private static class ComparatorIdade implements Comparator<Gato> {
        @Override
        public int compare(Gato gato1, Gato gato2) {
            return Integer.compare(gato1.getIdade(), gato2.getIdade());
        }
    }

    private static class ComparatorCor implements Comparator<Gato> {
        @Override
        public int compare(Gato gato1, Gato gato2) {
            return gato1.getCor().compareToIgnoreCase(gato2.getCor());
        }
    }

    private static class ComparatorNomeCorIdade implements Comparator<Gato> {
        @Override
        public int compare(Gato gato1, Gato gato2) {
            int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
            if (nome != 0) {
                return nome;
            }

            int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());
            if (cor != 0) {
                return cor;
            }
            return Integer.compare(gato1.getIdade(), gato2.getIdade());
        }
    }
}


