package com.company.devices;

import com.company.Human;
import com.company.Salable;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Phone extends Device implements Rechargable, Salable {
    String producer;
    String model;
    Integer yearOfProduction;
    HashSet<Application> applications;

    public Phone(String producer, String model, Integer yearOfProduction, double value) {
        super(producer, model, yearOfProduction, value);
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.applications = new HashSet<Application>();
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

    //public void installAnnApp(String name) {
    //    this.installAnnApp(name, "new");
    //}

    //public void installAnnApp(String name, String version) {
    //    this.installAnnApp(name, version, default_server);
    //}

    public void installAnnApp(String name, String version, String address, double price, Human owner) throws Exception {
        if (owner.cash < price) {
            throw new Exception("Właściciel nie ma wystarczająco gotówki na koncie.");
        }
        applications.add(new Application(name, version, price));
        owner.cash = owner.cash - price;
    }

    public boolean isInstalled(String app_name) {
        for (Application application:applications) {
            if (application.name == app_name) {
                return true;
            }
        }
        return false;
    }

    public void listFree() {
        for (Application application:applications) {
            if (application.price == 0.0) {
                System.out.println(application.toString());
            }
        }
    }

    public void alphaApps() {
        List<String> application_list = new ArrayList<String>();
        for (Application application:applications) {
            application_list.add(application.name);
        }
        Collections.sort(application_list);
        for (String application:application_list) {
            System.out.println(application);
        }
    }

    public void priceApps() {
        List<Double> application_list = new ArrayList<Double>();
        for (Application application:applications) {
            application_list.add(application.price);
        }
        Collections.sort(application_list);
        for (Double application:application_list) {
            System.out.println(application);
        }
    }

    public double countCost() {
        Double sum = 0.0;
        for (Application application:applications) {
            sum += application.price;
        }
        return sum;
    }

    public boolean isInstalled(Application app) {
        return isInstalled(app.name);
    }

//    public void installAnnApp(String[] names) {
//        for (String name:names) {
//            this.installAnnApp(name);
//        }
//    }



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
