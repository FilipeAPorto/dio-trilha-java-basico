public abstract class Conta implements IContaBancaria {

    private static final int AGENCIA_PADRAO = 1;
    private static int sequencial = 100;
    private int numAgencia;
    private int numConta;
    private double saldo;
    Cliente cliente;

    public Conta() {
        this.numAgencia = AGENCIA_PADRAO;
        this.numConta = sequencial++;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {

        if (this.saldo - valor >= 0) {
            saldo -= valor;

        } else {
            System.out.println("\n*** ERRO - Saldo insuficiente ***");
        }
    }


    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(int valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInformacoesComuns() {
        System.out.println(String.format("Número da agencia: %d", this.getNumAgencia()));
        System.out.println(String.format("Número da conta: %d", this.getNumConta()));
        System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
    }



    protected void exibirSaldo(){
        System.out.printf("\nO saldo é R$%.2f",this.getSaldo());
        System.out.println();
    }
}
