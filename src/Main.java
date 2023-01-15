import Drivers.DriversB;
import Drivers.DriversC;
import Drivers.DriversD;


public class Main {
    public static void main(String[] args) {
        DriversC kol9 = new DriversC("kol9", false, 9);

        DriversB[] driversBS = {new DriversB("Кот", true, 12)
        };
        DriversC[] driversCS = {new DriversC("Пёс", true, 12)

        };
        DriversD[] driversDS = {new DriversD("Петуз", true, 12)

        };

        Cars[] cars = {
                new Cars("Audi", "TT", 3.0, driversBS[0]),
                new Cars("Reno", "Capture", 2.8, driversBS[0]),
                new Cars("Volvo", "CR90", 2.5, driversBS[0])
        };
        Buses[] buses = {
                new Buses("Пазик", "ПЗ3", 1.7, driversDS[0]),
                new Buses("Газель", "ГаЗ_2000", 3.3, driversDS[0]),
                new Buses("Икарус", "Икар_1999", 0, driversDS[0])
        };

        Trucks[] trucks = {
                new Trucks("MAN", "19_84", 7.3, driversCS[0]),
                new Trucks("Камаз", "Кам_3000", 6.5, kol9),
                new Trucks("Volvo", "vol_2592", 8.3, driversCS[0])
        };

        Trucks kamaz = new Trucks("Kama", "32", 3.9, kol9);


        System.out.println(driversBS[0].getName());
        System.out.println(cars[2].getEngine());
        cars[0].printInfo();
        kamaz.printInfo();
        kamaz.PitStop();
        printInfo(cars[0]);

    }

    public static void printInfo(Transport<?> transport) {
        System.out.println("водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
        if (transport.getDriver().isLicense() != true) {
            System.out.println(transport.getBrand() + " никуда не едет , у водителя " + transport.getDriver().getName() + " нет прав ");
        }
    }
}
