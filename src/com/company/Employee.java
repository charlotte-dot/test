package com.company;

public abstract class Employee implements Payable {
    private final String firstName;
    private final String lastName;

    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public abstract double earnings ();
}
