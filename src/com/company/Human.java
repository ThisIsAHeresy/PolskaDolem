package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Arrays;

public class Human implements Salable{
    String firstName;
    String lastName;
    public Animal pet;
    public Phone mobilePhone;
    public Double cash;

    public String toString(){
        return this.firstName + " " + this.lastName + " with a pet " + this.pet + " and a phone number " + this.mobilePhone;
    }
    private Car[] garage;
    private Double salary;

    public Double getSalary() {
        System.out.println("Salary was retrieved, current value: "+this.salary.toString());
        return this.salary;
    }
    public Human(int garageSpaces) {
        super();
        garage = new Car[garageSpaces];
    }
    public boolean hasCar(Car newCar) {
        for(Car car : garage) {
            if (car == newCar) return true;
        }
        return false;
    }
    public boolean hasFreeSpace() {
        for(int i = 0;i < garage.length;i++) {
            if (this.garage[i] == null) return true;
        }
        return false;
    }

    public double valueOverall() {
        double counted_value = 0.0;
        for(int i = 0;i < garage.length;i++) {
            if (this.garage[i] != null) {
                counted_value = counted_value + this.garage[i].value;
            }
        }
        return counted_value;
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

    public void removeCar(Car carToRemove) {
        for (int i=0;i < garage.length;i++) {
            if (this.garage[i] == carToRemove) {
                this.garage[i] = null;
                return;
            }
        }
    }

    public void addCar(Car newCar) {
        for (int i=0;i < garage.length;i++) {
            if (this.garage[i] == null) {
                this.garage[i] = newCar;
                return;
            }
        }
    }

    public void sortCars() {
        Arrays.sort(this.garage);
    }
}
