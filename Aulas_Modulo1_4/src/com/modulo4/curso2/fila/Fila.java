package com.modulo4.curso2.fila;

public class Fila<T> {

    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(T object) {  // Adicionar um novo nó no final da fila
        No novoNo = new No(object);  // Declara um novo nó instanciando o Obejct referenciado
        novoNo.setRefNo(refNoEntradaFila); // Cria um novo objeto nó, seta a referencia do nó de entrada nesse novo nó.
        refNoEntradaFila = novoNo; // atribui a referencia de entrada agora na referencia do novo Nó.
    }

    public T dequeue() {  // Procurar a referencia do primeiro da Fila e retira-lo da fila
        if (!this.isEmpty()) {  // Se a fila não for vazia ...
            No primeiroNo = refNoEntradaFila; // Cria um nó auxiliar e atribui a referencia de entrada nesse novo nó
            No noAuxiliar = refNoEntradaFila; // Cria um  segundo nó auxiliar e atribui a referencia de entrada nesse novo nó
            while (true) {
                if (primeiroNo.getRefNo() != null) { // enquanto a referencia a frente do nó sendo chamado for diferente de nulo...
                    noAuxiliar = primeiroNo;  // atribui o segundo nó auxiliar = o primeiro nó auxiliar
                    primeiroNo = primeiroNo.getRefNo();  // atribui ao nó de referencia a referencia do nó a frente dele, até chegar no nulo para para o while.
                } else {
                    noAuxiliar.setRefNo(null); // seta o segundo nó auxiliar para nulo, tirando o primeiro da fila e tornando o segundo nó auxiliar o primeiro da fila
                    break;
                }
            }
            return (T) primeiroNo.getObject(); // retorna o nó que foi retirado da fila
        }
        return null;
    }

    public T first() {  // Procurar a referencia do primeiro da Fila sem retira-lo da fila
        if (!this.isEmpty()) {  // Se a fila não for vazia ...
            No primeiroNo = refNoEntradaFila; // Cria um nó auxiliar e atribui a referencia de entrada nesse novo nó
            while (true) {
                if (primeiroNo.getRefNo() != null) { // enquanto a referencia a frente do nó sendo chamado for diferente de nulo...
                    primeiroNo = primeiroNo.getRefNo();  // atribui ao nó de referencia a referencia do nó a frente dele, até chegar no nulo para para o while.
                } else {
                    break;
                }
            }
            return (T) primeiroNo.getObject(); // retorna o nó que foi retirado da fila
        }
        return null;
    }

    public boolean isEmpty() { // Verificar se a Fila esta vazia.
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null) {
            while (true) {
                stringRetorno += "[Nó{objeto=" + noAuxiliar.getObject() + "}]--->";
                if (noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}