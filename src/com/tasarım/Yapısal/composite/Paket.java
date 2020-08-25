package com.tasarım.Yapısal.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Paket implements FiyatlanabilirÜrün {
   private String adi;
   private List<ürün> ürünList;

    public Paket(String adi) {
        this.adi = adi;
        this.ürünList = new ArrayList<ürün>();
    }

    @Override
    public BigDecimal getFiyat() {
        return FiyatHesaplamaUtil.getToplamUrunFiyati(ürünList);
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<ürün> getÜrünList() {
        return ürünList;
    }

    public void setÜrünList(List<ürün> ürünList) {
        this.ürünList = ürünList;
    }
}
