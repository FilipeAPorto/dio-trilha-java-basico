package com.modulo3.curso2.pilares_poo.interface_.equipamentos.multifuncional;

import com.modulo3.curso2.pilares_poo.interface_.equipamentos.copiadora.Copiadora;
import com.modulo3.curso2.pilares_poo.interface_.equipamentos.digitalizadora.Digitalizadora;
import com.modulo3.curso2.pilares_poo.interface_.equipamentos.impressora.Impressora;

public class EquipamentoMutifuncional implements Copiadora, Digitalizadora, Impressora {


    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
}
