package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Human implements Salable{
    String firstName;
    String lastName;
    public Animal pet;
    public Phone mobilePhone;
    public Double cash;

    public Car getCar() {
        return car;
    }

    public void setCar() {
        this.car = null;
    }

    public void setCar(Car car) {
        if (this.salary > car.value) {
            System.out.println("You have successfully bought a car!");
            this.car = car;
        } else if (this.salary > car.value/12) {
            System.out.println("You have successfully bought a car however you have to pay out monthly debt!");
            this.car = car;
        } else {
            System.out.println("Start studying, find a new job or try getting a raise, idk, you cannot buy that car.");
        }
    }
    public String toString(){
        return this.firstName + " " + this.lastName + " with a pet " + this.pet + " and a phone number " + this.mobilePhone;
    }
    private Car car;
    private Double salary;

    public Double getSalary() {
        System.out.println("Salary was retrieved, current value: "+this.salary.toString());
        return this.salary;
    }
    public void setSalary(Double salary) throws Exception {
        if (salary < 0) {
            System.out.println("Salary cannot be negative!");
            return;
        }
        System.out.println("New salary has been sent to the system.");
        System.out.println("Please remember to grab the addendum to the agreement from Hania in HR.");
        System.out.println("ZUS and US already know about the changes.");
        this.salary = salary;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Nielegalna operacja.");
        return;
    }
}
