package com.company.devices;

import com.company.Human;
import com.company.Salable;

public class Phone extends Device implements Rechargable, Salable {
    String producer;
    String model;
    Integer yearOfProduction;

    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Włączono komórkę HALO?!?");
    }

    @Override
    public void recharge() {
        return;
    }

    @Override
    public double getChargeLevel() {
        return 0;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.mobilePhone!=this) {
            System.out.println("Sprzedający nie ma telefonu.");
        } else if (buyer.cash < price) {
            System.out.println("Kupujący nie ma hajsa.");
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.mobilePhone = seller.mobilePhone;
            seller.mobilePhone = null;
            System.out.println("Udało się sprzedać telefon komórkowy.");
        }

    }
}
