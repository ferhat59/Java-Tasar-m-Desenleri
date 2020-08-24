package com.tasarım.Yapısal.Bridge.muzikcalar;

import com.tasarım.Yapısal.Bridge.Muzik;

public class Spotify implements MüzikCalar {
    @Override
    public String MuzikCal(Muzik muzik) {
        System.out.println("Spotify " + muzik + " şarkısını çalıyor. ");

        return muzik.getSes();
    }
}
