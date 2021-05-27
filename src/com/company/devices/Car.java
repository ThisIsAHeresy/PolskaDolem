package com.company.devices;

import com.company.Human;
import com.company.Salable;

import java.util.LinkedList;

public abstract class Car extends Device implements Salable {
    public String producer;
    public String model;
    public Integer yearOfProduction;
    Double mileage;
    public Integer value;
    public LinkedList<Human> owners;

    public abstract void refuel();

    public Car(String producer, String model, Integer yearOfProduction, Double value, Human owner) {
        super(producer, model, yearOfProduction, value);
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.owners = new LinkedList<Human>();
        this.owners.add(owner);
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "producer='" + producer + '\'' +
//                ", model='" + model + '\'' +
//                ", mileage=" + mileage +
//                ", value=" + value +
//                '}';
//    }

    @Override
    public void turnOn() {
        System.out.println("Włączono samochód brum brum.");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.hasCar(this)) {
            throw new Exception("Brak auta u sprzedawcy.");
        }
        if (!buyer.hasFreeSpace()) {
            throw new Exception("Brak wolnego miejsca u kupującego");
        }
        if (buyer.cash < price) {
            throw new Exception("Kupujący nie posiada wystarczającego hajsa");
        }
        if (this.owners.getLast() != seller) {
            throw new Exception("Sprzedający nie widnieje jako ostatni właściciel pojazdu.");
        }

        seller.removeCar(this);
        buyer.addCar(this);
        seller.cash += price;
        buyer.cash -= price;
        this.owners.add(buyer);
        System.out.println("Tranzakcja przebiegła pomyślnie.");
    }

    public boolean wasAnOwner(Human person) {
        for (Human owner:
             this.owners) {
            if (person == owner) {
                return true;
            }
        }
        return false;
    }

    public boolean didAselltoB(Human seller, Human buyer) {
        for (int i = 0; i < this.owners.size()-1; i++) {
            if (this.owners.get(i) == seller) {
                if (this.owners.get(i+1) == buyer) {
                    return true;
                }
            }
        }
        return false;
    }

    public int howManyTransactions() {
        return this.owners.size()-1;
    }

    public int compareTo(Car car) {
        return this.yearOfProduction - ((Car) car).yearOfProduction;
    }
}
