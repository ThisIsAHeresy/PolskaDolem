package com.company.cars;

import com.company.Human;
import com.company.devices.Car;

public class Disel extends Car {

    @Override
    public void refuel() {
        System.out.println("Refueled the car");
    }

    public Disel(String producer, String model, Integer yearOfProduction, Double value, Human owner) {
        super(producer, model, yearOfProduction, value, owner);
    }


}
