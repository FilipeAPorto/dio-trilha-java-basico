package com.modulo3.curso2.pilares_poo.abstracao;

import com.modulo3.curso2.pilares_poo.heranca.Veiculo;

public class Autodromo {
    public static void main(String[] args) {

        Carro jeep = new Carro();

        jeep.setChassi("897897");

        //jeep.ligar();


        Moto z400 = new Moto();

        z400.setChassi("823654");
        //z400.ligar();
    }
}
