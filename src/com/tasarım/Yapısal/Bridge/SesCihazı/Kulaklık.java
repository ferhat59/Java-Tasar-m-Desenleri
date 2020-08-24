package com.tasarım.Yapısal.Bridge.SesCihazı;

public class Kulaklık implements  SesCihazı {
    @Override
    public void sesCal(String ses) {
        System.out.println("Kulaktık "+ ses+ " çalıyor");
    }
}
