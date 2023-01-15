
import Drivers.DriversB;

public class Cars extends Transport<DriversB> {
    public Cars(String brand, String model, double engine, DriversB driversB) {
        super(brand, model, engine, driversB);
    }

    @Override
    public void Start() {
        System.out.println(toString() + " машина поехала ");
    }

    @Override
    public void Stop() {
        System.out.println(toString() + " машина остановилась");
    }

    @Override
    public String toString() {
        return getBrand()+" "+getModel()+" "+getEngine();
    }
    @Override
    public void BestLapTime() {
        System.out.println("Лучший круг " + toString());
    }

    @Override
    public void MaximumSpeed() {
        System.out.println("Максимальная скорость " + getBrand());
    }

    @Override
    public void PitStop() {
        System.out.println("Заехали на питстоп " + toString());
    }

}
