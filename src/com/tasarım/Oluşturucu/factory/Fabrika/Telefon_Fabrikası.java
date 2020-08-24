package com.tasarım.Oluşturucu.factory.Fabrika;

import com.tasarım.Oluşturucu.AbstractFactory.Telefon;
import com.tasarım.Oluşturucu.AbstractFactory.model.GM9;
import com.tasarım.Oluşturucu.AbstractFactory.model.VestelZ20;

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
