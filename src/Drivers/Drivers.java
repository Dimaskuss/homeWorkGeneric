package Drivers;

import com.sun.jdi.connect.Transport;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Drivers {
    private String name;
    private boolean license;
    private int experience;
    private char licenceType;


    public char getLicenceType() {
        return licenceType;
    }

    public void setLicenceType(char licenceType) {
        this.licenceType = licenceType;
    }

    public Drivers(String name, boolean license, int experience, char licenceType) {
        this.name = name;
        this.license = license;
        this.experience = experience;
        this.licenceType = licenceType;
    }

    public abstract void checkLicence() throws LIcenceExeption;

    public void checkLicenceType() {
        try {
            checkLicence();
        } catch (LIcenceExeption e) {
            System.out.println("не правильный тип лицензии, пожалуйста введите корректный тип лицензии для данного гонщика");


        }
    }

    public abstract void startDrive();

    public abstract void stopDrive();

    public abstract void refuel();

    @Override
    public String toString() {
        return "Drivers{" +
                "name='" + name + '\'' +
                ", license=" + license +
                ", experience=" + experience +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLicense() {
        return license;
    }

    public void setLicense(boolean license) {
        this.license = license;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drivers drivers = (Drivers) o;
        return license == drivers.license && experience == drivers.experience && licenceType == drivers.licenceType && Objects.equals(name, drivers.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, license, experience, licenceType);
    }
}