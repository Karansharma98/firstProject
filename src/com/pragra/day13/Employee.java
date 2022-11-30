package com.pragra.day13;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private Address address;

    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private float salary;
    private String phoneNumber;
    private String emailId;
    private String designation;

    public int getId() {
        return id;
    }



    public String getFirstName() {
        return firstName;
    }



    public String getLastName() {
        return lastName;
    }



    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }




    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", salary=" + salary +
                ", phoneNumber=" + phoneNumber +
                ", emailId='" + emailId + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
