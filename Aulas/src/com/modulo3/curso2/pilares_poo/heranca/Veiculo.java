package com.modulo3.curso2.pilares_poo.heranca;

public class Veiculo {

    /*
    Herança é utilizada para padronizar um atributo ou metodo que são iguais(comuns entre si) em várias classes do mesmo package.
    (Ex: Placa veicular, chassi, combustivel, entre outros).
     */

    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

}
