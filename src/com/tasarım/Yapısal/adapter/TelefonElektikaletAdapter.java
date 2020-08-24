package com.tasarım.Yapısal.adapter;

public class TelefonElektikaletAdapter implements  ElektrikliAletler {
    private  Telefon telefon;

    public TelefonElektikaletAdapter(Telefon telefon) {
        this.telefon = telefon;
    }

    @Override
    public int prizetakelektrikal() {
        return telefon.sarjet();
    }
}
