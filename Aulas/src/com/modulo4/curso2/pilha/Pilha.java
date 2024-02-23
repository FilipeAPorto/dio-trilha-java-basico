package com.modulo4.curso2.pilha;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo) { // ADICIONA O NOVO NÓ NO TOPO DA PILHA
        No refAuxiliar = refNoEntradaPilha; //Cria um Nó auxiliar e atribui a referência da entrada da pilha
        refNoEntradaPilha = novoNo; //atribui a referência do novo Nó para referência de entrada da pilha
        refNoEntradaPilha.setRefNo(refAuxiliar); // pega a variavel da classe No e seta dentro dela o valor da referencia do nó anterior
    }

    public No pop() { // RETORNA O NÓ QUE ESTA NO TOPO E APAGA A SUA REFERÊNCIA
        if (!this.isEmpty()) {
            No noPoped = refNoEntradaPilha; // Pega o nó
            refNoEntradaPilha = refNoEntradaPilha.getRefNo(); //Seta q a referencia do nó abaixo na pilha
            return noPoped;
        }
        return null;
    }

    public No top() { // RETORNA O NÓ QUE ESTA NO TOPO, MAS NÃO APAGA A SUA REFERÊNCIA
        return refNoEntradaPilha;
    }

    public boolean isEmpty() { // VERIFICA SE A PILHA ESTA VAZIA.
        /*
        if (refNoEntradaPilha == null) {
            return true;
        }
        return false;
        */
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {

        String stringRetorno = "-------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "-------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;

            }
        }
        stringRetorno += "=============\n";
        return stringRetorno;
    }
}
