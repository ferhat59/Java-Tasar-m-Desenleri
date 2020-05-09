package com.tasarım.AbstractFactory.model;

import com.tasarım.AbstractFactory.Telefon;

public class GM9 implements Telefon {
    private  String model;
    private int fiyat;

    public GM9(String model, int fiyat) {
        this.model = model;
        this.fiyat = fiyat;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getfiyat() {
        return 0;
    }

    @Override
    public String toString() {
        return "GM9{" +
                "model='" + model + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }
}
