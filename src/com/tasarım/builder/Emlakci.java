package com.tasarım.builder;

public class Emlakci {
    public static void main(String[] args) {

ev ev1 = EvBuilder.startBuild()
        .setIl("tekirdağ")
        .setIlçe("malkara")
                .build();

printev(ev1);
    }
    public static void printev(ev ev1){
        System.out.println();
        System.out.println("Ev eklendi "+ev1.getIl());
    }
}
