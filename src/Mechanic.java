import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(organisation, mechanic.organisation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, organisation);
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", organisation='" + organisation + '\'' +
                '}';
    }
}

