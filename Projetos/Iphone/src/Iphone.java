public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    private int volume;

    public void alterarVolume(int volume) {

        if (volume >= 0 && volume <= 10) {
            this.volume = volume;
            System.out.println("Volume alterado para " + this.volume);
        } else if (volume < 0) {
            System.out.println("Volume mínimo atingido ( 0 - Zero)");
        } else {
            System.out.println("Volume máximo atingido(10 - Dez)");
        }
    }

    public void exibirVolume() {
        System.out.println("Volume atual é " + this.volume);
    }

    @Override
    public void ligar(int numero) {
        System.out.println("Ligando para o número " + numero);
    }

    @Override
    public void atender(int numero) {
        System.out.println("Atendendo ligação do número " + numero);
    }

    @Override
    public void iniciarCorreioVoz() throws InterruptedException {
        System.out.println("Iniciando correio de voz");

        Thread.sleep(4000);

        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música selecionada ");
    }

    @Override
    public void pausar() {
        System.out.println("Música Pausada !!");
    }

    @Override
    public void selecionarMusica(String musica) throws InterruptedException {
        System.out.println("Música " + musica + " selecionada");

        Thread.sleep(2500);

        tocar();
    }


    @Override
    public void exibirPagina(String pagina) {
        System.out.println("Pagina " + pagina + " exibida");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }
}
