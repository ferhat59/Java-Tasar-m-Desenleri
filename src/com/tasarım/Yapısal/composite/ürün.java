package com.tasarım.Yapısal.composite;

import java.math.BigDecimal;

public class ürün implements FiyatlanabilirÜrün{
private final String isim;
private  final BigDecimal fiyat;

    public ürün(String isim, BigDecimal fiyat) {
        this.isim = isim;
        this.fiyat = fiyat;
    }

    public String getIsim() {
        return isim;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }
}
