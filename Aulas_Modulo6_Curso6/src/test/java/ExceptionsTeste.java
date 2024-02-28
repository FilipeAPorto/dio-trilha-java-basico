import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validarCenarioDeExceptionNaTransferencia(){
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("123456", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();


        Assertions.assertThrows(IllegalArgumentException.class,() ->
                transferenciaEntreContas.transfere(contaOrigem,contaDestino, -1));
    }
}
