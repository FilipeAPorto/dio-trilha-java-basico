package com.modulo3.curso2.pilares_poo.interface_.equipamentos.digitalizadora;

public class Scanner implements Digitalizadora {
    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO");
    }
}
