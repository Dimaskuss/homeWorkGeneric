
import Drivers.DriversB;

public class Cars extends Transport<DriversB> {
    public enum BodyTypeCar {
        SEDAN("Седан"),
        HATCHBACK("Хэтчбэк"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        OFFROAD("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        final String  bodyTypeName;

        BodyTypeCar(String bodyTypeName) {
            this.bodyTypeName=bodyTypeName;
        }

        public String getBodyTypeName() {
            return bodyTypeName;
        }

        @Override
        public String toString() {
            return "Тип кузова " + getBodyTypeName();
        }
    }

    BodyTypeCar bodyTypeCar;

    public BodyTypeCar getBodyTypeCar() {
        return bodyTypeCar;
    }

    public void setBodyTypeCar(BodyTypeCar bodyTypeCar) {
        this.bodyTypeCar = bodyTypeCar;
    }

    public Cars(String brand, String model, double engine, DriversB driversB, BodyTypeCar bodyTypeCar) {
        super(brand, model, engine, driversB);
        this.bodyTypeCar=bodyTypeCar;

    }

    @Override
    public void start() {
        System.out.println(toString() + " машина поехала ");
    }

    @Override
    public void stop() {
        System.out.println(toString() + " машина остановилась");
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + " " + getEngine();
    }

    @Override
    public void printType() {
        if (getBodyTypeCar() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getBodyTypeCar());
        }
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
