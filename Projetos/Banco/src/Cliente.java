public class Cliente {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    void exibirDadosCliente() {
        System.out.println("Nome do cliente : " + this.nome);
    }
}
