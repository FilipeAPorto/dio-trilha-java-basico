import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTest {

    @Test // Anotação é primordial para testar
    void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jessica",
                LocalDateTime.of(2000, 1, 1, 15, 0, 0)); //cria o cenário
        Assertions.assertEquals(24, jessica.getIdade()); //Executa a validação
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa jessica = new Pessoa("Jessica",
                LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("João",LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }
}