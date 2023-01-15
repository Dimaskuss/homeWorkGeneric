import Drivers.Drivers;

public abstract class Transport<T extends Drivers> implements Competing {
    private String brand;
    private String model;
    private double engine;
    private T driver;


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

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }

    abstract public void Start();


    abstract public void Stop();

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
