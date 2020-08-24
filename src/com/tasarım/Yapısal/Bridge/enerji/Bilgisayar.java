package com.tasarım.Yapısal.Bridge.enerji;

import com.tasarım.Yapısal.Bridge.Muzik;
import com.tasarım.Yapısal.Bridge.SesCihazı.Kulaklık;
import com.tasarım.Yapısal.Bridge.muzikcalar.VLC;

public class Bilgisayar  extends EnerjiKaynağıPc{
    public Bilgisayar() {
        sesCihazı= new Kulaklık();
        müzikCalar=new VLC();

    }

    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("Bilgisayar müzik çalıyor ama hangi uygulamadan çalıyor beni ilgilendirmiyor");
        super.muzikCal(muzik);
    }
}
