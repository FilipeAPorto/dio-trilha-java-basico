package com.modulo3.curso2.pilares_poo.interface_.equipamentos.estabelecimento;

import com.modulo3.curso2.pilares_poo.interface_.equipamentos.impressora.DeskJet;
import com.modulo3.curso2.pilares_poo.interface_.equipamentos.impressora.Impressora;
import com.modulo3.curso2.pilares_poo.interface_.equipamentos.multifuncional.EquipamentoMutifuncional;

public class Fabrica {
    public static void main(String[] args) {


        Impressora impressora = new EquipamentoMutifuncional();

        impressora.imprimir();


    }
}
