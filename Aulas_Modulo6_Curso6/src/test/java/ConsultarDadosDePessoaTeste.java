import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosDePessoaTeste {

    @BeforeAll // Inicia no inicio de todos os Testes
    static void iniciarConexao() {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach // Executa ANTES de cada teste, se houver 2 @Test ele iniciará 2 vezes ANTES de cada teste
    void inserirDadosParaTeste() {
        BancoDeDados.inserirDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @AfterEach // Executa DEPOIS de cada teste, se houver 2 @Test ele iniciará 2 vezes DEPOIS de cada teste
    void removerDadosParaTeste(){
        BancoDeDados.removerDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }


    @Test
    void validarDadosDeRetorno1() {
        Assertions.assertTrue(true);
        System.out.println("Teste 1");
    }

    @Test
    void validarDadosDeRetorno2() {
        Assertions.assertNull(null);
        System.out.println("Teste 2");
    }


    @AfterAll // Depois de todos os testes
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
    }


}
