package com.tasarım.Yapısal.Bridge.enerji;

import com.tasarım.Yapısal.Bridge.Muzik;
import com.tasarım.Yapısal.Bridge.SesCihazı.SesCihazı;
import com.tasarım.Yapısal.Bridge.muzikcalar.MüzikCalar;

public class Telefon extends EnerjiKaynağıPc{

    public Telefon(SesCihazı sesCihazi, MüzikCalar muzikCalar) {

        super(sesCihazi, muzikCalar);
    }

    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("telefon müzik çalıyor ama hangi uygulamadan çalıyor beni ilgilendirmiyor");
        super.muzikCal(muzik);
    }
}
