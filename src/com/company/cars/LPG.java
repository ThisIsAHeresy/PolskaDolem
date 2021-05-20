package com.company.cars;

import com.company.devices.Car;

public class LPG extends Car {

    @Override
    public void refuel() {
        System.out.println("Refueled the car");
    }

    public LPG(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }


}
