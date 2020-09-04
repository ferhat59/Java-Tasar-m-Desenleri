package com.tasarım.Yapısal.Decorator.Model;

import com.tasarım.Yapısal.Decorator.Phone;
import com.tasarım.Yapısal.Decorator.PhoneDecorator;

public class S9 extends PhoneDecorator {
    public S9(Phone phone) {
        super(phone);
    }

    @Override
    public String getName() {
        return super.getName()+"S9";
    }

    @Override
    public int cameraCount() {
        return super.cameraCount()+2;
    }

    @Override
    public double getPrice() {
        return super.getPrice()+10000;
    }
}
