import Drivers.DriversD;

public class Buses extends Transport<DriversD> {
    public Buses(String brand, String model, double engine, DriversD driversD) {
        super(brand, model, engine, driversD);
    }

    @Override
    public void Start() {
        System.out.println("Поехал автобус" + toString());
    }

    @Override
    public void Stop() {
        System.out.println("Остановился автобус" + toString());
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
