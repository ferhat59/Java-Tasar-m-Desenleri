package com.tasarım.factory;

import com.tasarım.AbstractFactory.Telefon;
import com.tasarım.factory.Fabrika.Telefon_Fabrikası;

public class main {
    public static void main(String[] args) {
        Telefon telefon= Telefon_Fabrikası.getTelefon("GM9",15);
        Telefon telefon1= Telefon_Fabrikası.getTelefon("Vestel20",15);
        System.out.println(telefon1);
    }
}
