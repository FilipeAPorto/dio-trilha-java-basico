package com.modulo4.curso3.lista_circular;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }

    public void add(T conteudo) { //Adiciona mais um nó à Lista circular.
        No<T> novoNo = new No<>(conteudo); // Declara e instancia um novo Nó.

        if (this.tamanhoLista == 0) { //Se o tamanho da Lista for 0 (Zero)...
            this.cabeca = novoNo; // Atribui ao nó da cabeça o novo Nó.
            this.cauda = this.cabeca; // Atribui ao nó da cauda o nó da cabeça.
            this.cabeca.setNoProximo(cauda); // seta ao nó da cabeça o nó da cauda.

        } else { // Se o tamanho da lista  for maior igual à 1...
            novoNo.setNoProximo(this.cauda); // Seta ao novo Nó o nó da cauda.
            this.cabeca.setNoProximo(novoNo); // seta ao nó da cabeça o novo Nó.
            this.cauda = novoNo; // atribui ao nó da cauda o novo nó.
        }
        this.tamanhoLista++;
    }


    public void remove(int index) { // Remove da Lista o indice solicitado.
        if (index >= this.tamanhoLista) { // Se o indice for maior que a lista dará Exception.
            throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista!");
        }

        No<T> noAuxiliar = this.cauda; //Declara e atribui a um nó auxiliar o nó da cauda.

        if (index == 0) { //Se o índice for 0(Zero)...
            cauda = this.cauda.getNoProximo(); //Atribui à cauda a referencia do proximo nó após a cauda.
            this.cabeca.setNoProximo(this.cauda); //Seta ao nó da cabeça o novo nó da cauda.

        } else if (index == 1) { //Se o índice for 1...
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo()); //Seta ao nó da cauda o segundo Nó após a cauda.(Pulando a o nó do meio).

        } else { // se o índice for maior que 1
            for (int i = 0; i < index - 1; i++) {
                noAuxiliar = noAuxiliar.getNoProximo(); //Atribui ao nó auxiliar(que esta atribuido o nó da cauda) o nó após o auxiliar.
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo()); // Seta ao no Auxiliar o segundo nó do nó auxiliar.(Pulando a o nó do meio).
        }
        this.tamanhoLista--;
    }


    public T get(int index) { // Pega o conteúdo do Nó.
        return this.getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("A lista está vazia!");
        }
        if (index == 0) {
            return this.cauda;
        }
        No<T> noAuxiliar = this.cauda;
        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getNoProximo();

        }
        return noAuxiliar;
    }

    public boolean isEmpty() { // Verifica se a Lista esta vazia.
        return this.tamanhoLista == 0 ? true : false;
    }

    public int size() { // Retprma p tamanho da lista.
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        No<T> noAuxiliar = this.cauda;
        for (int i = 0; i < this.size(); i++) {
            strRetorno += " [No{conteudo = " + noAuxiliar.getConteudo() + "}] --->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += this.size() != 0 ? " (Retorna ao início)" : " []";

        return strRetorno;
    }
}
