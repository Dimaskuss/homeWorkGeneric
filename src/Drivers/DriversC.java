package Drivers;

import com.sun.jdi.connect.Transport;

public class DriversC extends Drivers {


    public DriversC(String name, boolean license, int experience) {
        super(name, license, experience);

    }

    public void driveCar() {
        System.out.println("поехали родной");
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public void startDrive() {
        System.out.println("водитель " + getName() + " начал движение ");
    }

    @Override
    public void stopDrive() {
        System.out.println("водитель " + getName() + " остановился ");
    }

    @Override
    public void refuel() {
        System.out.println("водитель " + getName() + " заехал на дозаправку ");
    }

}
