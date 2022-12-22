package com.pragra.practice.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class List {
    public static void main(String[] args) {

        java.util.List<Integer> list =new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(null);
        list.add(null);

        System.out.println(list);

//        list.add(2,25);
//        list.add(60);
//        System.out.println(list);
//
//        System.out.println(list.remove(1));
//
//        System.out.println(list);
//
//        System.out.println(list.remove(new Integer(10)));

//        List<Integer> list2 =new ArrayList<Integer>();
//
//        list2.add(60);
//        list2.add(70);
//        list2.add(80);
//        list2.add(90);
//        list2.add(100);
//
//list.addAll(list2);
//        System.out.println(list);
//
//        System.out.println(list.contains(10));
//
//        System.out.println(list.size());
//
//        list2.addAll(list);
//
//        System.out.println(list2);



//        for(int i=0; i<list.size();i++)
//        {
//            System.out.println(list.get(i));
//        }
//
//        System.out.println();
//        for (Integer element:list
//             ) {
//
//            System.out.println(element);
//
//        }

//        for(int i=0; i<list.size();i++)
//        {if(i%2==0)
//        {
//            list.remove(i);
//        }}
//        System.out.println(list);

//        for (Integer element:list
//        )
//        {
//            if(element%2==0)
//            list.remove(element);
//        }
//        System.out.println(list);


//        Iterator it=list.iterator();
//
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }


        java.util.List<Integer> list2=new LinkedList<Integer>();

        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(null);

//        System.out.println(list2);
//
//        list2.addAll(list);
//        System.out.println(list2);

        list2.remove(2);
        System.out.println(list2);

        System.out.println(list2.remove(new Integer(30)));

        for(int i=0;i<list2.size();i++)
        {
            System.out.println(list2.get(i));
        }
        System.out.println();

        for (Integer element: list2
        ) {

            System.out.println(element);


        }
        System.out.println();

        Iterator i=list2.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }


    }
}
