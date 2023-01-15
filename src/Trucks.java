import Drivers.Drivers;
import Drivers.DriversC;

public class Trucks extends Transport<DriversC> {

    public Trucks(String brand, String model, double engine, DriversC driversC) {
        super(brand, model, engine, driversC);
    }

    @Override
    public void Start() {
        System.out.println("Поехал грузовик" + toString());
    }

    @Override
    public void Stop() {
        System.out.println("Остановился грузовик" + toString());
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
