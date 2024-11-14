package nareshit.lab.dt14_11_24.q1;

public class Dog extends Mammal{
    private String breed;

    public Dog(String name,String breed,boolean hasFur)
    {
        super(name,hasFur);
        this.breed=breed;
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    public void displayDetails()
    {

        System.out.println("---Dog Details---\n");
        super.displayDetails();
        System.out.println("Breed :"+breed);
    }
}
