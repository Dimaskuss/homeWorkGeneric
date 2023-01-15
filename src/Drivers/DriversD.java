package Drivers;

public class DriversD extends Drivers {
    public DriversD(String name, boolean license, int experience) {
        super(name, license, experience);
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
