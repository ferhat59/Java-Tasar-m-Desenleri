package com.tasarım.factory.Fabrika;

import com.tasarım.AbstractFactory.Telefon;
import com.tasarım.AbstractFactory.model.GM9;
import com.tasarım.AbstractFactory.model.VestelZ20;

public class Telefon_Fabrikası {

    public static Telefon getTelefon(String model,int fiyat){
        Telefon telefon;

        if(model.equalsIgnoreCase("Vestelz20")){
            telefon = new VestelZ20(model,fiyat);
            return telefon;
        }
        else if(model.equalsIgnoreCase("GM9")){
            telefon = new GM9(model,fiyat);
        return telefon;
        }
        else {
            throw  new RuntimeException("hatalı giriş");
        }

}


}
