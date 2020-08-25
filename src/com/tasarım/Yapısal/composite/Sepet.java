package com.tasarım.Yapısal.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Sepet {
String adi;
List<FiyatlanabilirÜrün> fiyatlanabilirList= new ArrayList<>();
    public BigDecimal toplamOdenecekTutar(){

        BigDecimal toplamTutar = BigDecimal.ZERO;

        for (FiyatlanabilirÜrün fiyatlanabilir : fiyatlanabilirList) {
            toplamTutar = toplamTutar.add(fiyatlanabilir.getFiyat());
        }

        return toplamTutar;
    }
}
