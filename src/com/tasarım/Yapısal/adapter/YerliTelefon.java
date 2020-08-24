package com.tasarım.Yapısal.adapter;

public class YerliTelefon implements Telefon {
private int voltaj;

    public YerliTelefon() {
        this.voltaj = 5;
    }

    @Override
    public int sarjet() {
        System.out.println("yerli telefon şarj oluyor");
        return voltaj;
    }
}
