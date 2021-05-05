package com.company;

public class Car {
    public final String producer;
    public final String model;
    Double mileage;
    Integer value;

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                ", value=" + value +
                '}';
    }

    public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }
}
