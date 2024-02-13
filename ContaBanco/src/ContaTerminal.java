import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numConta;
        String agencia, nomeCliente;
        double saldo;

        System.out.print("Por favor, digite o número da conta : ");
        numConta = scan.nextInt();
        scan.nextLine();

        System.out.print("Por favor, digite o número da Agência : ");
        agencia = scan.nextLine();

        System.out.print("Por favor, digite o nome do cliente : ");
        nomeCliente = scan.nextLine();

        System.out.print("Por favor, digite o saldo disponivel : ");
        saldo = scan.nextDouble();

        System.out.println("\nOla " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numConta + " e seu saldo R$" + saldo + " já está disponível para saque");
    }
}