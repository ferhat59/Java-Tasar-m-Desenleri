package com.tasarım.Oluşturucu.Prototype;

public class MaliyetliSınıf2  implements CloneInterface{
    private int id2;
    private String name2;
    private Double boy2;

    public MaliyetliSınıf2(int id2, String name2, Double boy2) {
        System.out.println("MALİYET2 ÇALIŞTI");

        this.id2 = id2;
        this.name2 = name2;
        this.boy2 = boy2;
    }

    @Override
    public CloneInterface clone() {
        CloneInterface clone =null;

        try {
            clone= (CloneInterface) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }

}
