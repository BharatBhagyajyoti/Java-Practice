package nareshit.lab.dt14_11_24.q1;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void displayDetails()
    {
        System.out.println("Name :"+name);
    }
}
