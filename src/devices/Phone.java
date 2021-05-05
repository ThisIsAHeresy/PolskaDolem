package devices;

public class Phone extends Device {
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
        System.out.println("Włączono urządzenie.");
    }
}
