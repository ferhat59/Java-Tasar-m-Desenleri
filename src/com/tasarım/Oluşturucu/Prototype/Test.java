package com.tasarım.Oluşturucu.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
List<CloneInterface> cloneInterfaceList  =  new ArrayList<CloneInterface>();
cloneInterfaceList.add(new MaliyetliSınıf(1,"ferhat",180.13));
for(int i =0;i<100;i++){
    cloneInterfaceList.add(cloneInterfaceList.get(0).clone());
}
        System.out.println(cloneInterfaceList.get(59));


    }
}
