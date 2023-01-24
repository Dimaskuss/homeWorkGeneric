package Drivers;

public class DriversD extends Drivers {
    public DriversD(String name, boolean license, int experience, char licenceType) {
        super(name, license, experience, licenceType);
    }

    @Override
    public void checkLicence() throws LIcenceExeption {
        if (getLicenceType() != 'd' && getLicenceType() != 'D') {
            throw new LIcenceExeption("неправильная лицензия");
        }
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
