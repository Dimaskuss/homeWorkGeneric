import Drivers.Drivers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport<T extends Drivers> implements Competing {
    private String brand;
    private String model;
    private double engine;
    private T driver;
    private List<Mechanic> mechanics = new ArrayList<>();


    public Transport(String brand, String model, double engine, T driver) {
        if (brand == null || brand.equals("") || brand.isBlank()) {
            brand = "введите марку";
        }
        this.brand = brand;

        if (model == null || model.equals("") || model.isBlank()) {
            model = "введите модель";
        }
        this.model = model;

        if (Double.compare(engine, 0) == 0) {
            engine = 1.5;
        }
        this.engine = engine;

        this.driver = driver;
    }

    public void addMechanics(Mechanic<Transport>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }

    public void getAllMechanics() {
        for (Mechanic mechanic : mechanics) {
            System.out.println(mechanic.getName());
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }

    abstract public void getDiagnosed();


    abstract public void printType();

    abstract public void start();


    abstract public void stop();

    public  String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {

        this.engine = engine;
    }

    public T getDriver() {
        return driver;
    }

    public void printInfo() {
        System.out.println("водитель " + driver.getName() + " управляет автомобилем " + getBrand() + " и будет участвовать в заезде");
        if (driver.isLicense() != true) {
            System.out.println(getBrand() + " никуда не едет , у водителя " + driver.getName() + " нет прав ");
        }
    }
}
