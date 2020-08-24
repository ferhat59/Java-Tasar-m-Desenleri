package com.tasarım.Yapısal.Bridge.muzikcalar;

import com.tasarım.Yapısal.Bridge.Muzik;

public class VLC implements  MüzikCalar {
    @Override
    public String MuzikCal(Muzik muzik) {
        System.out.println("VLC " + muzik + " şarkısını çalıyor. ");

        return muzik.getSes();
    }
}
