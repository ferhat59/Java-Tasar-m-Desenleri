package com.tasarım.Yapısal.composite;

import java.math.BigDecimal;
import java.util.List;


public class FiyatHesaplamaUtil {
public static BigDecimal getToplamUrunFiyati(List<ürün> ürünList){
    BigDecimal toplamTutar=BigDecimal.ZERO;

    for (ürün ü :ürünList){
        toplamTutar=toplamTutar.add(ü.getFiyat());
    }
    return toplamTutar;
}
    public static BigDecimal getToplamPaketFiyati(List<Paket> paketList){

        BigDecimal toplamTutar = BigDecimal.ZERO;

        for (Paket paket : paketList) {
            toplamTutar = toplamTutar.add(paket.getFiyat());
        }

        return toplamTutar;
    }
}
