package com.pragra.day10;

import java.util.Arrays;

public class StringPrac {
    public static void main(String[] args) {
        String name1= new String("karan");
        String name2=name1;
        System.out.println(name1==name2);
        String k="karan".substring(3);
        String k1 ="an";
        System.out.println(k==k1);
        String r=new String("karan");
        System.out.println(r.intern());
        String name ="Karan Sharma";
        String[] s= name.split(" ");
        System.out.println(Arrays.toString(s));

        System.out.println(name.indexOf("ar",3));

        System.out.println(name.lastIndexOf('r'));
    }
}
