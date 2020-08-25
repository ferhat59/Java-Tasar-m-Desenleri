package com.tasarım.Yapısal.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Kumanya implements FiyatlanabilirÜrün{
    private String adi;
    private List<ürün> urunList;
    private List<Paket> paketList;

    public Kumanya(String adi) {
        this.adi = adi;
        this.urunList = new ArrayList<>();
        this.paketList = new ArrayList<>();
    }

    @Override
    public BigDecimal getFiyat() {
  BigDecimal toplamUrunFiyatı=  FiyatHesaplamaUtil.getToplamUrunFiyati(urunList);
  BigDecimal toplamPaketFiyatı=FiyatHesaplamaUtil.getToplamPaketFiyati(paketList);
        BigDecimal toplamFiyat = toplamUrunFiyatı.add(toplamPaketFiyatı);

        return toplamFiyat;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<ürün> getUrunList() {
        return urunList;
    }

    public void setUrunList(List<ürün> urunList) {
        this.urunList = urunList;
    }

    public List<Paket> getPaketList() {
        return paketList;
    }

    public void setPaketList(List<Paket> paketList) {
        this.paketList = paketList;
    }
}
