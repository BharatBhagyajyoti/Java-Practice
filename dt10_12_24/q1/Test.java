package nareshit.lab.dt10_12_24.q1;

public class Test extends Car{



    @Override
    public void display()
    {
        System.out.println("Brand: "+super.carBrand());
        System.out.println("Model: "+super.carModel());
        System.out.println("Milage: "+super.carMileage());
        System.out.println("Top Speed: "+super.carTopSpeed());
        System.out.println("Manufacture Year: "+super.carYear());
    }

    public static void main(String[] args) {
        Car c1= new Test();
        c1.display();
    }
}
