package nareshit.lab.dt13_11_24.q1;

public class Test {
    public static void main(String[] args) {
        Car c1=new Car("Volvo","XC90",2024,4);
        Bike b1= new Bike("Aprilla","SysV80",-2022,"Sports");

        c1.displayDetails();
        System.out.println("-----------------\n");
        b1.displayDetails();
    }
}
