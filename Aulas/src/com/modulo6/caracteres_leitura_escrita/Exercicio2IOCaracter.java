package com.modulo6.caracteres_leitura_escrita;

import java.io.*;
import java.util.Scanner;

//Abra o teclado para escrever 3 filmes/séries que você recomendaria e armazene em “recomendacoes.txt”.

public class Exercicio2IOCaracter {
    public static void main(String[] args) throws IOException {

        lerTecladoEscrevrerDocumento();
    }

    private static void lerTecladoEscrevrerDocumento() throws IOException {
        Scanner scan = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out); //printar na tela de forma diferente.


        pw.println("Digite 3 recomendações de filmes :");
        pw.flush(); //descarrega a conteúdo do método write no console (o de cima e esse é o sout)

        String line = scan.nextLine();

        File arquivo = new File("recomendacoes.txt"); //classe utilizada para especificar arquivos ou diretórios.

         /*Writer w = new FileWriter(f.getName());  ***Forma normal aqui e forma avançada o de baixo(sem o comentário)
        BufferedWriter bw = new BufferedWriter(w);*/
        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo.getName())); //criando o documento recomendacoes.txt
        //criando um buffer interno para armazenar os characters em vez de gravar diretamente no disco.
        //assim que buffer preenchido ou o gravador fechado, todos os characters do buffer são gravados no disco.


        do {
            bw.write(line); //escreva no buffer interno a linha capturada pelo scanner
            bw.newLine(); //pule para próxima linha no buffer
            line = scan.nextLine(); //pegue a proxima linha do teclado
        } while (!line.equalsIgnoreCase("Fim"));
        bw.flush(); //terminado o laço, descarrege as informações capturadas pelo teclado no arquivo recomendacoes.txt

        pw.printf("Arquivo \"%s\" foi criado com sucesso", arquivo.getName());

        //fechando os fluxos
        bw.close(); //fechamos o fluxo de saída para escrita no documento
        pw.close(); //fechamos o fluxo de saída para o console
        scan.close(); //fechamos o fluxo de entrada através do teclado

    }
}
