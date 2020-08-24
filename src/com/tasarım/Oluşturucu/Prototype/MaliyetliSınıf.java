package com.tasarım.Oluşturucu.Prototype;

public class MaliyetliSınıf implements CloneInterface {
private int id;
private String name;
private Double boy;

    public MaliyetliSınıf(int id, String name, Double boy) {
        System.out.println("MALİYET1 ÇALIŞTI");
        this.id = id;
        this.name = name;
        this.boy = boy;
    }

    @Override
    public String toString() {
        return "MaliyetliSınıf{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", boy=" + boy +
                '}';
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
