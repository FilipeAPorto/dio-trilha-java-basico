package com.modulo4.curso3.lista_duplamente_encadeada;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    //Existe mais metodos que podem ser implementados para Lista.

    public void add(T elemento) { //Adicionar um novo Nó ao final da Lista
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);  //Declara e instancia um novo Nó
        novoNo.setNoProximo(null); // seta ao no criado que o proximo nó é nulo.
        novoNo.setNoPrevio(ultimoNo); // Seta ao nó criado o que o nó anterior é o ultimo nó declarado
        if (primeiroNo == null) {
            primeiroNo = novoNo; // atribui ao primeiro Nó a referencia do novo nó
        }
        if (ultimoNo != null) {
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento) { //Adicionar um novo Nó ao indice escolhido
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(noAuxiliar);

        if (novoNo.getNoProximo() != null) {
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        } else {
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }
        if (index == 0) {
            primeiroNo = novoNo;
        } else {
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }
        tamanhoLista++;
    }

    public void remove(int index) { // Remove o Nó no indice escolhido
        if (index == 0) { // se o indice for 0 (zero)...
            primeiroNo = primeiroNo.getNoProximo(); // atribui para o primeiro nó a referencia do nó que esta a frente.
            if (primeiroNo != null) { // logo, se o nó da frente não for nulo.
                primeiroNo.setNoPrevio(null); // seta o no de tras desse nó selecionado o valor Nulo.
            }
        } else { // Se o indice for diferente de 0(zero)...
            NoDuplo<T> noAuxiliar = getNo(index);  // cria um nó auxiliar e atribui o o nó do indice escolhido a ele.
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo()); //Setando ao nó anterior ao do indice o nó depois do indice.
            if (noAuxiliar != ultimoNo) { // se o no do indice não for o ultimo Nó da lista ...
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio()); //seta ao proximo nó do indice escolhido o nó anterior ao do indice.
            } else { // se for o ultimo nó da lista...
                ultimoNo = noAuxiliar; // atribui o nó ao ultimo da lista.
            }
        }
        this.tamanhoLista--;
    }

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public int size() { //Verifica o tamanho do nó.
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i = 0 ; i < size();i++){
            strRetorno += "[No{conteudo = " + noAuxiliar.getConteudo() + "}]---->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
