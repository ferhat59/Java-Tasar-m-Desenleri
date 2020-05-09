package com.tasarım.AbstractFactory.Fabrikalar;

import com.tasarım.AbstractFactory.TelefonFabrika;
import com.tasarım.AbstractFactory.Telefon;

import com.tasarım.AbstractFactory.model.GM9;
import com.tasarım.AbstractFactory.model.VestelZ20;

public class VestelZ20Fabrika implements TelefonFabrika {
    private  static VestelZ20Fabrika vestelZ20Fabrika;
    private VestelZ20Fabrika(){
        System.out.println("I am create");
    }
    @Override
    public Telefon getTelefon(String model, int fiyat) {

        return new VestelZ20(model,fiyat);

    }
    public static VestelZ20Fabrika getGM9Fabrika(){
        if(vestelZ20Fabrika==null){
            vestelZ20Fabrika= new VestelZ20Fabrika();

        }
        return  vestelZ20Fabrika;
    }

}
