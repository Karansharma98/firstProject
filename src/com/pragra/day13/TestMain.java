package com.pragra.day13;

import java.util.Scanner;

public class TestMain
{


    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the id: ");
        int id=sc.nextInt();


        System.out.println("Enter the first name: ");
        String fName=sc.next();


        System.out.println("Enter the last name: ");
        String lName=sc.next();

        System.out.println("Enter the email: ");
        String email=sc.next();


        Address address =new Address(  "101 EASTVALE",
                "NEAR XYZ HOTEL",
                "BRAMPTON",
                "ON",
                "CA");




boolean t=email.contains("@");
if(t==true)
        {

            Employee emp = new Employee(id, fName, lName);
            emp.setDesignation("developer");
            emp.setPhoneNumber("123");
            emp.setSalary(200000f);
            emp.setAddress(address);
            emp.setEmailId(email);

            System.out.println(emp);

        }

else {
    System.out.println("Email is not verified");
}

    }
}
