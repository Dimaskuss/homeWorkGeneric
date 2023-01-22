import Drivers.Drivers;

import java.util.*;

public abstract class Transport<T extends Drivers> implements Competing {
    private String brand;
    private String model;
    private double engine;
    private T driver;
    public final Set<Mechanic<?>> mechanics = new HashSet<>();


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

    public void addMechanics(Mechanic<Transport<?>>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }

    public void getAllMechanics() {
        for (Mechanic<?> mechanic : mechanics) {
            System.out.println(mechanic.getName());
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engine, engine) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(driver, transport.driver) && Objects.equals(mechanics, transport.mechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engine, driver, mechanics);
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

    public String getBrand() {
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
