package com.tasarım.Yapısal.Facade;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        Facade facade= new Facade();
        facade.krediKullan(new müşteri("ferhat","1234"),new BigDecimal(10000));
    }
}
