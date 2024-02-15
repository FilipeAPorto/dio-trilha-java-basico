import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean sair = false;
        int operacao1, operacao2;

        Conta poupanca = new ContaPoupanca();
        Conta corrente = new ContaCorrente();
        Cliente cliente = new Cliente();

        System.out.println("\n*** BEM VINDO AO BANCO SACO FURADO ***");

        System.out.println("\nVamos criar sua conta ");

        System.out.print("Insira seu nome : ");
        cliente.setNome(scan.nextLine());

        System.out.println("\nBem vindo(a) " + cliente.getNome());

        while (!sair) {

            operacao1 = obterOpcaoMenu1(scan);

            if (operacao1 == 1) { //CONTA POUPANÇA
                while (!sair) {

                    operacao2 = obterOpcaoMenu2(scan);

                    if (operacao2 == 1) {
                        boolean entradaValida = false;

                        while (!entradaValida) {
                            try {
                                System.out.print("\nQual valor sacar : ");

                                String entrada = scan.nextLine();
                                entrada = entrada.replaceAll(",", "."); // Converte virgula em ponto para o Java entender (Bom para inserir valores)
                                poupanca.sacar(Double.parseDouble(entrada));

                                poupanca.exibirSaldo();

                                entradaValida = true;

                            } catch (Exception e) {
                                System.out.println("\n*** ERRO - LETRA DIGITADA - INSIRA SOMENTE NÚMEROS ***");
                            }
                        }
                    } else if (operacao2 == 2) {
                        System.out.print("\nQual valor depositar : ");

                        boolean entradaValida = false;
                        while (!entradaValida) {
                            try {
                                String entrada = scan.nextLine();
                                entrada = entrada.replaceAll(",", "."); // Converte virgula em ponto para o Java entender (Bom para inserir valores)

                                poupanca.depositar(Double.parseDouble(entrada));

                                poupanca.exibirSaldo();

                                entradaValida = true;
                            } catch (Exception e) {
                                System.out.println("\n*** ERRO - LETRA DIGITADA - INSIRA SOMENTE NÚMEROS ***");
                            }
                        }

                    } else if (operacao2 == 3) {
                        poupanca.exibirSaldo();

                    } else if (operacao2 == 4) {
                        cliente.exibirDadosCliente();
                    } else {
                        break;
                    }
                }
            } else if (operacao1 == 2) {

                while (!sair) {

                    operacao2 = obterOpcaoMenu2(scan);

                    if (operacao2 == 1) {
                        System.out.print("\nQual valor sacar : ");

                        boolean entradaValida = false;
                        while (!entradaValida) {
                            try {
                                String entrada = scan.nextLine();
                                entrada = entrada.replaceAll(",", ".");

                                corrente.sacar(Double.parseDouble(entrada));

                                corrente.exibirSaldo();

                                entradaValida = true;

                            } catch (Exception e) {
                                System.out.println("\n*** ERRO - LETRA DIGITADA - INSIRA SOMENTE NÚMEROS ***");
                            }
                        }

                    } else if (operacao2 == 2) {
                        System.out.print("\nQual valor depositar : ");

                        boolean entradaValida = false;
                        while (!entradaValida) {
                            String entrada = scan.nextLine();
                            entrada = entrada.replaceAll(",", ".");

                            corrente.depositar(Double.parseDouble(entrada));

                            corrente.exibirSaldo();

                            entradaValida = true;
                        }

                    } else if (operacao2 == 3) {
                        corrente.exibirSaldo();

                    } else if (operacao2 == 4) {
                        cliente.exibirDadosCliente();

                    } else {
                        break;
                    }
                }
            }
        }
    }

    static int obterOpcaoMenu1(Scanner scan) {
        boolean entradavalida = false;
        int opcao = 0;

        while (!entradavalida) {
            System.out.println("\nQual conta gostaria de gerenciar");
            System.out.println("1 - Conta Poupança");
            System.out.println("2 - Conta Corrente");
            System.out.print("Digite a opção desejada: ");

            try {
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao >= 0 && opcao <= 2) {
                    entradavalida = true;
                } else {
                    System.out.println("\n*** ERRO - INSIRA UM NÚMERO VÁLIDO ***");
                }
            } catch (Exception e) {
                System.out.println("\n*** ERRO - LETRA DIGITADA - INSIRA UM NÚMERO VÁLIDO ***");
            }
        }
        return opcao;
    }

    static int obterOpcaoMenu2(Scanner scan) {
        boolean entradaValida = false;
        int opcao = 0;

        while (!entradaValida) {
            System.out.println("\nQual operação realizar");
            System.out.println("1 - Saque");
            System.out.println("2 - Depóstio");
            System.out.println("3 - Mostrar saldo ");
            System.out.println("4 - Mostrar dados do cliente");
            System.out.println("0 - Voltar");
            System.out.print("Digite a opção desejada: ");

            try {
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao >= 0 && opcao <= 4) {
                    entradaValida = true;
                } else {
                    System.out.println("\n*** ERRO - INSIRA UM NÚMERO VÁLIDO ***");
                }
            } catch (Exception e) {
                System.out.println("\n*** ERRO - LETRA DIGITADA - INSIRA UM NÚMERO VÁLIDO ***");
            }
        }
        return opcao;
    }
}