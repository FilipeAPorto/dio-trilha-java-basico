import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        Iphone iphone = new Iphone();

        int operador, numTelefone = 991458717;
        boolean sair = false;

        while (!sair) {

            operador = verificarLista(scan);

            if (operador == 1) {

                operador = verificarListaAparelhoTelefonico(scan);

                if (operador == 1) {

                    System.out.print("\nInsira o número desejado : ");
                    iphone.ligar(scan.nextInt());
                    scan.nextLine();


                } else if (operador == 2) {
                    System.out.println("\nAtender ligação do número " + numTelefone + " ?");
                    System.out.println("1 - SIM");
                    System.out.println("2 - NÃO");
                    System.out.print("Digite : ");

                    try {
                        String entrada = scan.nextLine();
                        operador = Integer.parseInt(entrada);

                        do {
                            if (operador == 1) {
                                iphone.atender(numTelefone);
                                sair = true;
                            } else if (operador == 2) {
                                System.out.println("Ligação não atendida");
                                sair = true;
                            } else {
                                System.out.println("Opção inválida - Insira o número correspondente");
                            }

                        } while (!sair);
                    } catch (Exception e) {
                        System.out.println("Caractere inserido - Insira somente o número correspondente");
                    }
                    sair = false;

                } else if (operador == 3) {
                    iphone.iniciarCorreioVoz();
                }
            } else if (operador == 2) {
                operador = verificarListaReprodutorMusica(scan);

                if (operador == 1) {
                    System.out.print("Escreva o nome da música : ");
                    iphone.selecionarMusica(scan.nextLine());

                } else if (operador == 2) {
                    iphone.tocar();

                } else if (operador == 3) {
                    iphone.pausar();
                }
            } else if (operador == 3) {
                operador = verificarListaNavegador(scan);

                if (operador == 1) {
                    iphone.adicionarNovaAba();

                } else if (operador == 2) {
                    System.out.print("Escreva o nome da página : ");
                    iphone.exibirPagina(scan.nextLine());
                } else if (operador == 3) {
                    iphone.atualizarPagina();
                }
            } else if (operador == 4) {
                System.out.print("Digite o volume (0 - 10) : ");
                iphone.alterarVolume(scan.nextInt());
                scan.nextLine();
            }
        }
    }

    static int verificarLista(Scanner scan) {
        int opcao = 0;

        System.out.println();
        System.out.println("1 - Telefone");
        System.out.println("2 - Musica");
        System.out.println("3 - Safari");
        System.out.println("4 - Alterar volume");
        System.out.print("Digite :");
        try {
            String entrada = scan.nextLine();
            opcao = Integer.parseInt(entrada);

            if (opcao < 1 || opcao > 4) {
                System.out.println("\n*** Opção Invalida ***");
            }

        } catch (Exception e) {
            System.out.println("\n*** Caractere inválido digitado - Insira somente o número da opção desejada ***");
        }

        return opcao;
    }

    static int verificarListaAparelhoTelefonico(Scanner scan) {
        int opcao = 0;

        System.out.println();
        System.out.println("1 - Ligar");
        System.out.println("2 - Atender uma ligação");
        System.out.println("3 - Iniciar Correio de voz");
        System.out.print("Digite : ");

        try {
            String entrada = scan.nextLine();
            opcao = Integer.parseInt(entrada);

            if (opcao < 1 || opcao > 3) {
                System.out.println("\n*** Opção Invalida ***");
            }

        } catch (Exception e) {
            System.out.println("\n*** Caractere inválido digitado - Insira somente o número da opção desejada ***");
        }

        return opcao;
    }

    static int verificarListaReprodutorMusica(Scanner scan) {
        int opcao = 0;

        System.out.println();
        System.out.println("1 - Selecionar música");
        System.out.println("2 - Tocar música");
        System.out.println("3 - Pausar música");
        System.out.print("Digite : ");

        try {
            String entrada = scan.nextLine();
            opcao = Integer.parseInt(entrada);

            if (opcao < 1 || opcao > 3) {
                System.out.println("\n*** Opção Invalida ***");
            }

        } catch (Exception e) {
            System.out.println("\n*** Caractere inválido digitado - Insira somente o número da opção desejada ***");
        }

        return opcao;
    }

    static int verificarListaNavegador(Scanner scan) {
        int opcao = 0;

        System.out.println();
        System.out.println("1 - Adiocionar nova aba");
        System.out.println("2 - Exibir página");
        System.out.println("3 - Atualizar Página");
        System.out.print("Digite : ");

        try {
            String entrada = scan.nextLine();
            opcao = Integer.parseInt(entrada);

            if (opcao < 1 || opcao > 3) {
                System.out.println("\n*** Opção Inválida ***");
            }

        } catch (Exception e) {
            System.out.println("\n*** Caractere inválido digitado - Insira somente o número da opção desejada ***");
        }
        return opcao;
    }
}
