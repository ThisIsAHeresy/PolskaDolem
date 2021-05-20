package com.company.devices;

import com.company.Human;
import com.company.Salable;

public abstract class Car extends Device implements Salable {
    public String producer;
    public String model;
    public Integer yearOfProduction;
    Double mileage;
    public Integer value;

    public abstract void refuel();

    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
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

        seller.removeCar(this);
        buyer.addCar(this);
        seller.cash += price;
        buyer.cash -= price;
        System.out.println("Tranzakcja przebiegła pomyślnie.");
    }
}
