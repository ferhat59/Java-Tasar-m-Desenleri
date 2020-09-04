package com.tasarım.Yapısal.Facade;

import java.math.BigDecimal;

public class Facade {
private final Banka banka;
private final MerkezBankası merkezBankası;
private final Kredi kredi;

    public Facade() {
        this.banka = new Banka();
        this.merkezBankası = new MerkezBankası();
        this.kredi = new Kredi();

    }
    public void krediKullan(müşteri m, BigDecimal deger){
        if(!merkezBankası.karaListe(m)&&kredi.krediDurum(m)&&banka.kredikullan(m,deger)){
            System.out.println(m+ " "+ deger+" kadar kredi kullandı ");
        }
    }

}
