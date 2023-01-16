import Drivers.DriversD;

public class Buses extends Transport<DriversD> {
    BodyTypeBus bodyTypeBus;

    public BodyTypeBus getBodyTypeBus() {
        return bodyTypeBus;
    }

    public void setBodyTypeBus(BodyTypeBus bodyTypeBus) {
        this.bodyTypeBus = bodyTypeBus;
    }

    public Buses(String brand, String model, double engine, DriversD driversD, BodyTypeBus bodyTypeBus) {
        super(brand, model, engine, driversD);
        this.bodyTypeBus = bodyTypeBus;
    }

    @Override
    public void printType() {
        if (getBodyTypeBus() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getBodyTypeBus());
        }
    }

    public enum BodyTypeBus {
        VERY_LOW(0, 10),
        LOW(0, 25),
        MIDDLE(40, 50),
        HIGH(60, 80),
        VERY_HIGH(100, 120);
        private int seatMin;
        private int seatMax;

        BodyTypeBus(int seatMin, int seatMax) {
            this.seatMin = seatMin;
            this.seatMax = seatMax;
        }

        @Override
        public String toString() {
            if (seatMin == 0) {
                return "Количество мест до " + seatMax;
            }

            return "Вместимость: " + seatMin + " - " + seatMax + " мест";
        }

        public int getSeatMin() {
            return seatMin;
        }

        public int getSeatMax() {
            return seatMax;
        }
    }

    @Override
    public void start() {
        System.out.println("Поехал автобус" + toString());
    }

    @Override
    public void stop() {
        System.out.println("Остановился автобус" + toString());
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
