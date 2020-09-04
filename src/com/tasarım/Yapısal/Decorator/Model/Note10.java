package com.tasarım.Yapısal.Decorator.Model;

import com.tasarım.Yapısal.Decorator.Phone;
import com.tasarım.Yapısal.Decorator.PhoneDecorator;

public class Note10 extends PhoneDecorator {
    public Note10(Phone phone) {
        super(phone);
    }

    @Override
    public String getName() {
        return super.getName()+" Note 10";
    }

    @Override
    public int cameraCount() {
        return super.cameraCount()+1;
    }

    @Override
    public double getPrice() {
        return super.getPrice()+99999;
    }
}
