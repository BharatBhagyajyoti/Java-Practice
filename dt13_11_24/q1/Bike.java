package nareshit.lab.dt13_11_24.q1;

public class Bike extends Vehicle{
    String type;
    public Bike(String make, String model, int year,String type) {

        super(make, model, year);
        this.type=type;
    }

    void displayDetails()
    {
        if (year<=0)
        {
            System.out.println("Invalid input in \"Bike details\" !");
        }
        else {
            super.displayDetails();
            System.out.println("Type :" + type);
        }
    }
}
