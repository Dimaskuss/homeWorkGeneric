import Drivers.Drivers;
import Drivers.DriversC;

public class Trucks extends Transport<Drivers> {
    BodyTypeTruck bodyTypeTruck;

    public Trucks(String brand, String model, double engine, Drivers drivers, BodyTypeTruck bodyTypeTruck) {
        super(brand, model, engine, drivers);
        this.bodyTypeTruck = bodyTypeTruck;

    }


    public BodyTypeTruck getBodyTypeTruck() {
        return bodyTypeTruck;
    }

    public void setBodyTypeTruck(BodyTypeTruck bodyTypeTruck) {
        this.bodyTypeTruck = bodyTypeTruck;
    }

    public enum BodyTypeTruck {
        N1(0, 3.5f),
        N2(3.5f, 12f),
        N3(12f, 0);
        private float weightMin;
        private float weightMax;


        BodyTypeTruck(float weightMin, float weightMax) {

            this.weightMin = weightMin;
            if (weightMax > 12f) {
                weightMax = 0f;
            }
            this.weightMax = weightMax;
        }

        float getWeightMax() {
            return weightMax;
        }

        float getWeightMin() {
            return weightMin;
        }

        @Override
        public String toString() {
            if (weightMin == 0) {
                return "Грузоподъемность до " + weightMax + " тонн";
            }
            if (weightMax == 0) {
                return "Грузоподъемность до " + weightMin + " тонн";

            }
            return "Грузоподъемность от " + weightMin + " до " + weightMax;
        }
    }


    @Override
    public void getDiagnosed() {
        System.out.println(this.toString() + " могут проходить диагностику");
    }

    @Override
    public void printType() {
        if (getBodyTypeTruck() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getBodyTypeTruck());
        }
    }

    @Override
    public void start() {
        System.out.println("Поехал грузовик" + toString());
    }

    @Override
    public void stop() {
        System.out.println("Остановился грузовик" + toString());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучший круг " + toString());
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость " + getBrand());
    }

    @Override
    public void pitStop() {
        System.out.println("Заехали на питстоп " + toString());
    }


}
