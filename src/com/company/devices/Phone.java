package com.company.devices;

import com.company.Human;
import com.company.Salable;

import java.net.URL;

public class Phone extends Device implements Rechargable, Salable {
    String producer;
    String model;
    Integer yearOfProduction;

    static final URL default_server = new URL("https", "example.com", 433, "app");

    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction, );
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

    public void installAnnApp(String name) {
        this.installAnnApp(name, "new");
    }

    public void installAnnApp(String name, String version) {
        this.installAnnApp(name, version, default_server);
    }

    public void installAnnApp(String name, String version, String address) {
        System.out.println("Installed " + name + " with version " + toString(version) + " and address " + address + " successfully");
    }

    public void installAnnApp(String[] names) {
        for (String name:names) {
            this.installAnnApp(name);
        }
    }

    public void installAnnApp(URL url) {
        System.out.println("Installed " + url + " successfully");
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
