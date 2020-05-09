package com.tasarım.AbstractFactory;

import com.tasarım.AbstractFactory.Fabrikalar.GM9Fabrika;


public class main {
    public static void main(String[] args) {
        Telefon telefon=  GM9Fabrika.getGM9Fabrika().getTelefon("GM9",15);
        //Telefon telefon= GM9Fabrika.getTelefon("GM9",15);
        //Telefon telefon1= Telefon_Fabrikası.getTelefon("Vestel20",15);
        System.out.println(telefon);
    }
}
