import java.util.Scanner;

public class SwtichCase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira uma Letra : ");
        String sigla = scan.next().toUpperCase();

        switch (sigla) {
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MÉDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }
    }
}
