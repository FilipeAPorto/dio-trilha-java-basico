import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDateTime;

public class AssertionsTeste {

    @Test
    void validarLancamentos(){

        int [] primeiroLancamento = {10,20,30,40,50};
        int [] segundoLancamento = {10,20,30,40,50};

        Assertions.assertArrayEquals(primeiroLancamento,segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;

        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDateTime.now());
        Assertions.assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes(){
        double valor1 = 5.0;
        double valor2 = 5.0;

        Assertions.assertEquals(valor1,valor2);
    }
}
