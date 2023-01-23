import Drivers.*;

import java.util.*;


public class Main {


    public static void main(String[] args) throws LIcenceExeption {


        DriversC kol9 = new DriversC("kol9", false, 9, 'c');

        DriversB[] driversBS = {new DriversB("Кот", true, 12, 'h')
        };
        DriversC[] driversCS = {new DriversC("Пёс", true, 12, 'n')

        };
        DriversD[] driversDS = {new DriversD("Петуз", true, 12, 'g')

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

        Mechanic misha = new Mechanic("Михаил", "Пичинятор");
        Mechanic leha = new Mechanic("Алексей", "Пичинятор");
        Mechanic sasha = new Mechanic("Александр", "Пичинятор");
        Mechanic vlad = new Mechanic("Владимир", "Пичинятор");
        Mechanic yar = new Mechanic("Ярослав", "Пичинятор");


        List<Transport> participant = new ArrayList<>();
        participant.add(cars[0]);
        participant.add(cars[1]);
        participant.add(cars[2]);
        participant.add(trucks[0]);
        participant.add(trucks[1]);
        participant.add(trucks[2]);
        participant.add(buses[0]);
        participant.add(buses[1]);
        participant.add(buses[2]);



//
        Set<Drivers> driversSet = new HashSet<>();
        driversSet.add(driversDS[0]);
        driversSet.add(driversBS[0]);
        driversSet.add(driversCS[0]);
        driversSet.add(driversCS[0]);
        driversSet.add(driversCS[0]);
        driversSet.add(kol9);

        for (Drivers drivers : driversSet) {
            System.out.println(drivers);

        }

        System.out.println();

        Iterator<Drivers> iter = driversSet.iterator();
        while (iter.hasNext()) {
            Drivers drivers = iter.next();
            System.out.println(drivers);
        }
//
        List<Drivers> drivers = new ArrayList<>();
        drivers.add(driversCS[0]);
        drivers.add(driversBS[0]);
        drivers.add(driversDS[0]);
        drivers.add(kol9);
// мапа
        Map<Transport<?>, Mechanic<?>> transportMechanicHashMap = new HashMap<>();
        transportMechanicHashMap.put(cars[0], misha);
        transportMechanicHashMap.put(buses[0], misha);
        transportMechanicHashMap.put(cars[0], yar);
        transportMechanicHashMap.put(cars[0], vlad);
        transportMechanicHashMap.put(cars[2], vlad);

//        System.out.println(transportMechanicHashMap);
//

        cars[0].addMechanics(leha, misha, sasha);
        cars[1].addMechanics(leha, misha, yar);
        cars[2].addMechanics(sasha, vlad, yar);
        trucks[0].addMechanics(leha, misha, sasha);
        trucks[1].addMechanics(sasha, vlad, yar, yar, yar);
        trucks[2].addMechanics(leha, misha, yar);
        buses[0].addMechanics(leha, misha, sasha);
        buses[1].addMechanics(leha, vlad, yar);
        buses[2].addMechanics(sasha, vlad, yar);

//        System.out.println(participant.size());
//
//        for (Transport transport : participant) {
//            serviseInfo(transport);
//
//        }


//
//        misha.maintenance(trucks[1]);
//        serviseInfo(cars[1]);

//        System.out.println(driversBS[0].getName());
//        System.out.println(cars[2].getEngine());
//        cars[0].printInfo();
//        kamaz.printInfo();
//        kamaz.pitStop();
//        printInfo(cars[0]);
//        System.out.println(Cars.BodyTypeCar.VAN.toString());
//        System.out.println(Trucks.BodyTypeTruck.N1.toString());
//        cars[2].printType();


//        printInfo(kamaz);
//        trucks[0].getDiagnosed();
//        buses[2].getDiagnosed();
//        driversCS[0].checkLicenceType();
//       driversBS[0].checkLicence();
//serviseInfo(participant.get(3));
    }

    public static void serviseInfo(Transport<?> transport) {
        System.out.println(transport.getModel() + " " + transport.getBrand() + " транспортное средство с водителем по имени " + transport.getDriver().getName() + " имеет механиков :");
        transport.getAllMechanics();
    }

    public static void printInfo(Transport<?> transport) throws LIcenceExeption {


        if (transport.getDriver().isLicense() == true) {
            transport.getDriver().checkLicenceType();

            System.out.println("водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
        }
        if (transport.getDriver().isLicense() != true) {
            transport.getDriver().checkLicenceType();
            System.out.println(transport.getBrand() + " никуда не едет , у водителя " + transport.getDriver().getName() + " нет прав ");
        }

    }
}
