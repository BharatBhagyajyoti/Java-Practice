package nareshit.lab.dt_05_12_24.q1;

public class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public  void makeSound()
    {
        System.out.println("generic animal sound");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                '}';
    }
    public Animal reproduce()
    {
        System.out.println("Generic reproduction method for all animals");
        return new Animal("Unknown");
    }
}
