package modulo2;

import java.util.Scanner;

public class LevantarMjolnir {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int forca, contador;
        String nome;

        // System.out.print("Quantas testes realizar : ");
        contador = scan.nextInt();

        for (int i = 0; i < contador; i++) {
            // System.out.print("Nome : ");
            nome = scan.next();

            // System.out.print("Qual a força dele : ");
            forca = scan.nextInt();

            if (nome.equals("Thor")) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}
