package nareshit.lab.dt13_11_24.q1;

public class Car extends Vehicle{
    int numberOfDoors;

    public Car(String make, String model, int year,int numberOfDoors) {
        super(make,model,year);
        this.numberOfDoors = numberOfDoors;
    }

    void displayDetails()
    {
        if (year <=0 || numberOfDoors<=0)
        {
            System.out.println("Invalid input in in \"Car details\"");
        }
        else {
            super.displayDetails();
            System.out.println("No. of doors :" + numberOfDoors);
        }
    }
}
