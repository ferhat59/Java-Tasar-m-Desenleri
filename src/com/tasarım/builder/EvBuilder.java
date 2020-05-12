package com.tasarım.builder;

public class EvBuilder {

    private String il;
    private  String ilçe;
    private  String mahalle;
    private int yil;
    private int odasayisi;

    public static EvBuilder startBuild(){
        return new EvBuilder();
    }
    public  ev build(){
        ev ev1 = new ev();
        ev1.setIl(il);
        ev1.setMahalle(mahalle);
        ev1.setIlçe(ilçe);
        ev1.setYil(yil);
        ev1.setOdasayisi(odasayisi);
    return ev1;

    }

    public EvBuilder setIl(String il) {
        this.il = il;
        return  this;
    }

    public EvBuilder setIlçe(String ilçe) {
        this.ilçe = ilçe;
        return this;
    }

    public EvBuilder setMahalle(String mahalle) {
        this.mahalle = mahalle;
        return this;
    }

    public EvBuilder setYil(int yil) {
        this.yil = yil;
        return this;
    }

    public EvBuilder setOdasayisi(int odasayisi) {
        this.odasayisi = odasayisi;
        return this;
    }

}
