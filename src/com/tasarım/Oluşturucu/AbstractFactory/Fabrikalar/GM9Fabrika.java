package com.tasarım.Oluşturucu.AbstractFactory.Fabrikalar;

import com.tasarım.Oluşturucu.AbstractFactory.TelefonFabrika;
import com.tasarım.Oluşturucu.AbstractFactory.Telefon;
import com.tasarım.Oluşturucu.AbstractFactory.model.GM9;


public class GM9Fabrika implements TelefonFabrika {
    private  static GM9Fabrika gm9Fabrika;
    private GM9Fabrika(){
        System.out.println("I am create");
    }
    @Override
    public Telefon getTelefon(String model, int fiyat) {
        return new GM9(model,fiyat);
    }
    public static GM9Fabrika getGM9Fabrika(){
                if(gm9Fabrika==null){
                    gm9Fabrika= new GM9Fabrika();
            }
        return  gm9Fabrika;
        }

    }

