package com.modulo4.curso3.lista_encadeada;

public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    public ListaEncadeada() {
        referenciaEntrada = null;
    }


    public void add(T conteudo) { // Adiciona um novo nó ao final da Lista
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()) {
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size() - 1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index) { // Pega o conteudo do No indice
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {
        this.validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T remove(int index) { // Retorna o conteudo do nó que removeu.
        No<T> noPivor = this.getNo(index);

        if (index == 0) {
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();

        }

        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    public int size() { // retorna o tamanho da Lista
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while (true) {
            if (referenciaAux != null) {
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null) {
                    referenciaAux = referenciaAux.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }

    private void validaIndice(int index) {
        if (index >= this.size()) {
            int ultimoIndice = this.size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no indice " + index +
                    " desta lista. Esta lista só vai até o indice " + ultimoIndice + ".");
        }
    }

    public boolean isEmpty() { // Verificar se a Lista esta vazia.
        return referenciaEntrada == null ? true : false;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;

        for (int i = 0; i < this.size(); i++) {

            strRetorno += " No{Conteudo=" + noAuxiliar.getConteudo() + "} ---->";

            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
