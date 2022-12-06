package com.pragra.Assignment.Inheritance;

public class Bmw extends Car{

    @Override
    public int price()
    {
        return 100000;
    }

    public int horsePower()
    {
        return 500;
    }

    public String engineType()
    {
        return "V8";
    }
}