package com.pragra.practice;

public class Encapsulation {
    private int id;
    private String name;

    public Encapsulation(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Encapsulation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Encapsulation a=new Encapsulation(1,"karan");
        System.out.println(a.getId());
        System.out.println(a.getName());
    }
}
