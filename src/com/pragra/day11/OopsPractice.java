package com.pragra.day11;

public class OopsPractice {
    public static void main(String[] args) {
        Student.marks(50);
        Student.name("karan");

        Student st =new Student();
        st.discription();
        Student st1=new Student(1,4,"Karan");
        System.out.println(st1);
    }
}
