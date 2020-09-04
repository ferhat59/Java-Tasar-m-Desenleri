package com.tasarım.Yapısal.Decorator;

public class PhoneDecorator implements Phone {
    protected Phone phone;
    public PhoneDecorator(Phone phone){
        this.phone = phone;
    }
    @Override
    public String getName() {
        return phone.getName();
    }

    @Override
    public int cameraCount() {
        return phone.cameraCount();
    }

    @Override
    public double getPrice() {
        return phone.getPrice();
    }
}
