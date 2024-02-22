package com.modulo4.curso6.list.labs.exer01;

public class Temperatura {

    private double valorTemperatura;
    private int mes;

    public Temperatura(double valorTemperatura, int mes) {
        this.valorTemperatura = valorTemperatura;
        this.mes = mes;
    }

    public double getValorTemperatura() {
        return valorTemperatura;
    }

    @Override
    public String toString() {
        String strAuxiliar = "";
        switch (this.mes) {
            case 0:
                strAuxiliar = "Janeiro";
                break;
            case 1:
                strAuxiliar = "Fevereiro";
                break;
            case 2:
                strAuxiliar = "Março";
                break;
            case 3:
                strAuxiliar = "Abril";
                break;
            case 4:
                strAuxiliar = "Máio";
                break;
            case 5:
                strAuxiliar = "Junho";
                break;
            default:
                System.out.println("ERROR - toString");
        }
        return "("+strAuxiliar + " - Temperatura do mês = " + valorTemperatura +"º) --->";
    }
}
