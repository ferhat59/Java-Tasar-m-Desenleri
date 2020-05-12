package com.tasarım.builder;

public class ev {
    private String il;
    private  String ilçe;
    private  String mahalle;
    private int yil;
    private int odasayisi;

    public ev() {

    }

    public ev(String il, String mahalle, int yil) {
        this.il = il;
        this.mahalle = mahalle;
        this.yil = yil;
    }

    public ev(String il, String ilçe, String mahalle, int yil) {
        this.il = il;
        this.ilçe = ilçe;
        this.mahalle = mahalle;
        this.yil = yil;
}

    public String getIlçe() {
        return ilçe;
    }

    public void setIlçe(String ilçe) {
        this.ilçe = ilçe;
    }

    public int getOdasayisi() {
        return odasayisi;
    }

    public void setOdasayisi(int odasayisi) {
        this.odasayisi = odasayisi;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
