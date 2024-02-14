package com.modulo3.curso2.pilares_poo.interface_.equipamentos.impressora;

public class LaserJet implements Impressora {
    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO LASERJET");
    }
}
