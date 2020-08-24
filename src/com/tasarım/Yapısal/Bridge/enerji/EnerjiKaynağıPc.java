package com.tasarım.Yapısal.Bridge.enerji;

import com.tasarım.Yapısal.Bridge.Muzik;
import com.tasarım.Yapısal.Bridge.SesCihazı.SesCihazı;
import com.tasarım.Yapısal.Bridge.muzikcalar.MüzikCalar;

public  class EnerjiKaynağıPc {
protected SesCihazı sesCihazı;
protected MüzikCalar müzikCalar;
    public EnerjiKaynağıPc() {
    }

    public EnerjiKaynağıPc(SesCihazı sesCihazi, MüzikCalar muzikCalar) {
        this.sesCihazı = sesCihazi;
        this.müzikCalar = muzikCalar;
    }
    public  void  muzikCal(Muzik muzik){
        System.out.println("bir cihaz müzik çalıyor hangi cihaz olduğu beni ilgilendirmez");
        String ses = müzikCalar.MuzikCal(muzik);
        sesCihazı.sesCal(ses);
    }
}
