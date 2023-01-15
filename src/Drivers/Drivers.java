package Drivers;

import com.sun.jdi.connect.Transport;

public abstract class Drivers {
    private String name;
    private boolean license;
    private int experience;

    public Drivers(String name, boolean license, int experience) {
        this.name = name;
        this.license = license;
        this.experience = experience;
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
}