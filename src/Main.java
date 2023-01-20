import Drivers.DriversB;
import Drivers.DriversC;
import Drivers.DriversD;
import Drivers.LIcenceExeption;


public class Main {
    public static void main(String[] args) throws LIcenceExeption {
        DriversC kol9 = new DriversC("kol9", false, 9,'r');

        DriversB[] driversBS = {new DriversB("Кот", true, 12,'h')
        };
        DriversC[] driversCS = {new DriversC("Пёс", true, 12,'n')

        };
        DriversD[] driversDS = {new DriversD("Петуз", true, 12,'g')

        };

        Cars[] cars = {
                new Cars("Audi", "TT", 3.0, driversBS[0], Cars.BodyTypeCar.COUPE),
                new Cars("Reno", "Capture", 2.8, driversBS[0], Cars.BodyTypeCar.CROSSOVER),
                new Cars("Volvo", "CR90", 2.5, driversBS[0], null)
        };
        Buses[] buses = {
                new Buses("Пазик", "ПЗ3", 1.7, driversDS[0], Buses.BodyTypeBus.MIDDLE),
                new Buses("Газель", "ГаЗ_2000", 3.3, driversDS[0], Buses.BodyTypeBus.VERY_HIGH),
                new Buses("Икарус", "Икар_1999", 0, driversDS[0], Buses.BodyTypeBus.MIDDLE)
        };
        Trucks[] trucks = {
                new Trucks("MAN", "19_84", 7.3, driversCS[0], Trucks.BodyTypeTruck.N2),
                new Trucks("Камаз", "Кам_3000", 6.5, kol9, Trucks.BodyTypeTruck.N3),
                new Trucks("Volvo", "vol_2592", 8.3, driversDS[0], Trucks.BodyTypeTruck.N1)
        };

        Trucks kamaz = new Trucks("Kama", "32", 3.9, kol9, Trucks.BodyTypeTruck.N3);


        System.out.println(driversBS[0].getName());
        System.out.println(cars[2].getEngine());
        cars[0].printInfo();
        kamaz.printInfo();
        kamaz.pitStop();
        printInfo(cars[0]);
        System.out.println(Cars.BodyTypeCar.VAN.toString());
        System.out.println(Trucks.BodyTypeTruck.N1.toString());
        cars[2].printType();
        kamaz.printType();
        trucks[0].getDiagnosed();
//        buses[2].getDiagnosed();
        driversCS[0].checkLicenceType();
       driversBS[0].checkLicence();
    }

    public static void printInfo(Transport<?> transport) throws LIcenceExeption {
        transport.getDriver().checkLicenceType();
        System.out.println("водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
        if (transport.getDriver().isLicense() != true) {
            System.out.println(transport.getBrand() + " никуда не едет , у водителя " + transport.getDriver().getName() + " нет прав ");
        }
    }
}
