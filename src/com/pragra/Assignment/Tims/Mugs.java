package com.pragra.Assignment.Tims;

import java.sql.SQLOutput;

public class Mugs implements TimsMerchandise{

    @Override
    public void toString1() {

        System.out.println();
    }

    @Override
    public int getPrice() {
        int a=5;
       return a;

    }

    @Override
    public void getFeatures() {
        System.out.println("New featured built mugs are available now");

    }
}
