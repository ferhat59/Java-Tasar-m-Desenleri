package com.tasarım.Yapısal.Decorator;

import com.tasarım.Yapısal.Decorator.Model.S9;

public class Test {
    public static void main(String[] args) {
        Phone phone= new S9(new Samsung());
        System.out.println(phone.getName());
    }
}
