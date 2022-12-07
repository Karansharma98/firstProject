package com.pragra.Assignment.Tims;

import java.sql.SQLOutput;

public class Mugs implements TimsMerchandise{

    @Override
    public void toString1() {

        System.out.println();
    }

    @Override
    public void getPrice() {
        int a=5;
        System.out.println("Price : " +a+ "$ " );

    }

    @Override
    public void getFeatures() {
        System.out.println("New featured built mugs are available now");

    }
}
