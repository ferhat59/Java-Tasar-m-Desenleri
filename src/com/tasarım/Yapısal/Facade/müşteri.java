package com.tasarım.Yapısal.Facade;

public class müşteri {
private final String ad;
private final String tc;

    public müşteri(String ad, String tc)    {
        this.ad = ad;
        this.tc = tc;
    }

    @Override
    public String toString() {
        return "müşteri{" +
                "ad='" + ad + '\'' +
                ", tc='" + tc + '\'' +
                '}';
    }
}
