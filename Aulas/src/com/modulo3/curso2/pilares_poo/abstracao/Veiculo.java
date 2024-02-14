package com.modulo3.curso2.pilares_poo.abstracao;

public abstract class Veiculo {

    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public abstract void ligar();
}
