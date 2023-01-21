public class Mechanic<N extends Transport > {

    private String name;
    private String organisation;

    public Mechanic(String name, String organisation) {
        this.name = name;
        this.organisation = organisation;
    }


    public void maintenance(N n){
        System.out.println("механик "+getName() + " проводит обследование " );
    }
    public void repair(N n){
        System.out.println( "механик "+getName() + " чинит машину " );

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }
}
