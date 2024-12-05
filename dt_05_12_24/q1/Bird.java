package nareshit.lab.dt_05_12_24.q1;

public class Bird extends Animal{
    boolean canFly;

    public  Bird(boolean canFly, String species)
    {
        super(species);
        this.canFly=canFly;
    }

    @Override
    public void makeSound() {
        System.out.println("Bird animal sound");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "canFly=" + canFly +
                ", species='" + this.getSpecies()+'\''+
                '}';
    }

    @Override
    public Animal reproduce() {
        System.out.println("Birds lay eggs as a means of reproduction");
        return new Bird(this.canFly,getSpecies());
    }

    public void buildNest()
    {
        System.out.println("Birds building nests for their eggs");
    }

}
