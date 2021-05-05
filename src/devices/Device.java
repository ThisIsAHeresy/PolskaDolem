package devices;

abstract class Device {
    public final String producer;
    public final String model;
    public final Integer yearOfProduction;
    public boolean turnedOn;

    protected Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.turnedOn = false;
    }


    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction='" + yearOfProduction + '\'' +
                '}';
    }

    public void turnOn() {
        this.turnedOn = true;
    }
}
