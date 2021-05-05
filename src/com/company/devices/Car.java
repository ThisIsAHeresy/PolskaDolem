package com.company.devices;

import com.company.Human;
import com.company.Salable;

public class Car extends Device implements Salable {
    public String producer;
    public String model;
    public Integer yearOfProduction;
    Double mileage;
    public Integer value;

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
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getCar()!=this) {
            System.out.println("Sprzedający nie ma samochodu.");
        } else if (buyer.cash < price) {
            System.out.println("Kupujący nie ma hajsa.");
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.setCar(seller.getCar());
            seller.setCar();
            System.out.println("Udało się sprzedać samochód.");
        }
    }
}
