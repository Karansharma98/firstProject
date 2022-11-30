package com.pragra.day10;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String s1="karan";

        String s2="richa";
        String s3="shivam";
        System.out.println(s1.compareTo(s2));
        if(s1.compareTo(s2) >0)
        {
            System.out.println(s1 +" " +s2);

        }else

        System.out.println(s2 +" " +s1);


        // Compare three alphabets
        Compare();


        String[] split = s2.split("a");
        String s4=" karan";
        System.out.println(s4.trim());

        System.out.println(s1.indexOf('a',2));

        String s5="12345";
        int i = Integer.parseInt("123");
        System.out.println(Integer.parseInt("123"));


        System.out.println(Double.parseDouble("123.45"));

        Integer integer = Integer.valueOf("123");

        Integer x=10;
        System.out.println(x.intValue());

        StringBuilder sb= new StringBuilder("karan");
        System.out.println(sb.append(1));

        System.out.println(sb.insert(3,"xxx"));

       String name ="karan sharma";
        String[] s = name.split(" ");
        System.out.println(Arrays.toString(s));

        System.out.println(name.replace("ar", "AR"));

        char[] chars = name.toCharArray();

        System.out.println(Arrays.toString(chars));

        System.out.println(name.indexOf("a",2));

        System.out.println(name.lastIndexOf("a"));

        //System.out.println(Integer.parseInt(name));

        //Integer integer1 = Integer.valueOf(name);
        //System.out.println(integer1);

        StringBuilder s6=new StringBuilder("karan");
        System.out.println(s6.append(1));

    }
    public static void Compare() {


        String S1="c";
        String S2="Z";
        String S3="V";

        if(S1.compareTo(S2)>0 && S1.compareTo(S3)>0)
        {
            if (S2.compareTo(S3)>0) {
                System.out.println(S1 + " " + S2 + " " + S3);
            }
            else {
                System.out.println(S1 + " " + S3 + " " + S2);
            }
        }

        else if ( S2.compareTo(S1)>0 && S2.compareTo(S3)>0)
        {
            if (S1.compareTo(S3)>0) {
                System.out.println(S2 + " " + S1 + " " + S3);
            }
            else {
                System.out.println(S2 + " " + S3 + " " + S1);
            }
        }
        else {
            if (S1.compareTo(S2)>0) {
                System.out.println(S3 + " " + S1 + " " + S2);
            }
            else {
                System.out.println(S3 + " " + S2 + " " + S1);
            }
        }
    }

}
