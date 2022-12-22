package com.pragra.Assignment.Collections;

import java.util.Objects;

public class Employee {

    private String firstName;
    private String  lastName;
    private Double salary;
    private String phoneNo;

    public Employee(String firstName, String lastName, Double salary, String phoneNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.phoneNo = phoneNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(salary, employee.salary) && Objects.equals(phoneNo, employee.phoneNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, salary, phoneNo);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}
