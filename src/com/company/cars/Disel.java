package com.company.cars;

import com.company.devices.Car;

public class Disel extends Car {

    @Override
    public void refuel() {
        System.out.println("Refueled the car");
    }

    public Disel(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }


}
