public interface IContaBancaria {

    void sacar(double valorSaque);

    void depositar(double valorDeposito);

    void transferir(int valorTransferencia, Conta destino);

    void imprimirExtrato();
}