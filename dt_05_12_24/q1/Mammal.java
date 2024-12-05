package nareshit.lab.dt_05_12_24.q1;

public class Mammal extends Animal{
    boolean hasFur;

    public Mammal(String species, boolean hasFur) {
        super(species);
        this.hasFur = hasFur;
    }
    @Override
    public void makeSound()
    {
        System.out.println("Mammal animal sound");
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "hasFur=" + hasFur +
                ", species='" + this.getSpecies() + '\'' +
                '}';
    }

    @Override
    public Animal reproduce() {
        System.out.println("Mammals give birth to live young");
        return new Mammal(getSpecies(),this.hasFur);
    }

    public  void nurseYoung(){
        System.out.println("mammals nursing their young");
    }
}
