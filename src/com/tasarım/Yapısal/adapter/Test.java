package com.tasarım.Yapısal.adapter;

public class Test {
    public static void main(String[] args) {
        Priz priz= new Priz();

        YerliTelefon yerliTelefon = new YerliTelefon();
TelefonElektikaletAdapter telefonElektikaletAdapter=new TelefonElektikaletAdapter(yerliTelefon);
priz.elektrikver(telefonElektikaletAdapter);

    }
}
