package com.tasarım.Yapısal.Decorator;

public class Samsung  implements  Phone{
    @Override
    public String getName() {
        return "Samsung";
    }

    @Override
    public int cameraCount() {
        return 3;
    }

    @Override
    public double getPrice() {
        return 1000;
    }
}
