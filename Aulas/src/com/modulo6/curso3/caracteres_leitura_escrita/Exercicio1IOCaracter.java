package com.modulo6.curso3.caracteres_leitura_escrita;

import java.io.*;
//Abra o teclado para escrever 3 filmes que você recomendaria e exiba esses filmes no console.

public class Exercicio1IOCaracter {
    public static void main(String[] args) {
        receberTecladoImprimirConsole();
    }

    public static void receberTecladoImprimirConsole() {


        System.out.println("Recomende 3 filmes : ");

        /* **Abrindo teclado
        InputStream is = System.in; **abrindo um fluxo de dados para receber entrada através do teclado
        Reader isr = new InputStreamReader(is); **Ponte que transforma o fluxo do InputStream em character
        BufferedReader br = new BufferedReader(isr); **lê o stream de character e armazena em um buffer para facilitar
        a leitura desses characteres */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //As 2 formas acima dão certo para abrir o teclado.

        String line = null; //método readLine lê cada linha do texto e retorna uma String.


        try { //IO tem q ser tratado. ou adicionar o Throw na sentença
            line = br.readLine();

        /* **preparando a escrita no console
        OutputStream os = System.out; **abrindo um fluxo de dados para enviar dados para o console.
        OutputStreamWriter osr = new OutputStreamWriter(os);  ** ponte que transforma o fluxo OutputStream em character
        ** grava o stream de character (texto) e armazena em um buffer para facilitar a escrita desses characteres
        BufferedWriter bw = new BufferedWriter(osr);*/

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do { //Lendo do teclado e enviando para o console
                bw.write(line); //pegue a linha lida através do teclado e armazene em um buffer
                bw.newLine(); //depois insira uma linha
                line = br.readLine(); //depois de realizado a cópia da linha a cima, preenchemos a linha novamente
            } while (!line.isEmpty()); //quando a linha estiver vazia, pare.

            bw.flush(); //Descarrega o buffer - tipo print
            br.close(); //fechamos o fluxo de entrada
            bw.close(); //fechamos o fluxo de saída

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
