import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());



    public static void iniciarConexao(){
        LOGGER.info("Iniciou Conexão");
    }

    public static void finalizarConexao(){
        LOGGER.info("Finalizou Conexão");
    }

    public static void inserirDados(Pessoa pessoa){
        //Insere pessoa no Banco de Dados
        LOGGER.info("Inseriu Dados");
    }

    public static void removerDados(Pessoa pessoa){
        //Insere pessoa no Banco de Dados
        LOGGER.info("Removeu Dados");
    }



}
