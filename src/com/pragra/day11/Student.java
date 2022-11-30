package com.pragra.day11;

public class Student {
     int age;
    int grade;
    String name;

public Student()
{
    super();
    System.out.println(" default");
}

    public Student(int age) {
    this();
        System.out.println('1');
        this.age = age;

    }

    public Student(int age, int grade) {
    this(age);
        System.out.println('2');
        this.grade = grade;
    }

    public Student(int age, int grade, String name) {
    this(age, grade);
        System.out.println('3');
        this.name = name;
    }



    public static void marks(int a) {
int marks =a+10;
        System.out.println(marks);
    }


    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                '}';
    }

    public static void name(String name)
    {
        System.out.println(name);
    }

    public   void discription()
    {
        age =22;
        grade=90;
        name="rohan";
        System.out.println(age);
        System.out.println(grade);
        System.out.println(name);
    }

}

