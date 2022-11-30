package com.pragra.day13.Inheritance;

public class Vechile {
     String color;
     String engineType;
     String numberOfTyres;
     String fuelType;


    public void acceralte()
    {
        System.out.println("Person is talking");

    }

    public void applyBreak()
    {
        System.out.println("Person is walking");
    }
}



class  Car extends Vechile
        {
            String color;
                String engineType="electrical";
                String numberOFTires="4";
                String fuelType="Petrol";
                String numberOfSeats="4";

            public void acceralte()
            {
                System.out.println("Car is accelerating ..");

            }

            public void applyBreak()
            {
                System.out.println("Car is breaking");

            }

            public static void main(String[] args) {
                Car car=new Car();

                car.acceralte();
                car.applyBreak();
            }

        }