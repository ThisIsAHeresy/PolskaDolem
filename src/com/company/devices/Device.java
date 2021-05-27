package com.company.devices;

abstract class Device {
    public final String producer;
    public final String model;
    public final Integer yearOfProduction;
    public boolean turnedOn;
    public double value;

    protected Device(String producer, String model, Integer yearOfProduction, double value) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.turnedOn = false;
        this.value = value;
    }


    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction='" + yearOfProduction + '\'' +
                '}';
    }

    abstract public void turnOn();
}
