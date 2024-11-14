package nareshit.lab.dt13_11_24.q1;

public class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayDetails()
    {
//        if (year<=0)
//        {
//            System.out.println("Invalid input");
//        }
//        else {
            System.out.println("Make :" + make);
            System.out.println("Model :" + model);
            System.out.println("Year :" + year);
//        }
    }
}
