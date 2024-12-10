package nareshit.lab.dt10_12_24.q1;

abstract class Car {
    String brand ;
    String model;
    int mileage;
    int top_speed;
    int yearOfManufacturing;



//    public Car() {
////        this.brand = "";
////        this.model = "";
////        this.mileage = 0;
////        this.top_speed = 0;
////        this.yearOfManufacturing = 0;
//    }



    public abstract void display();


    public String carBrand() {
        brand="TATA";
        return brand;
    }


    public String carModel() {
        model="Curvv";
        return model;
    }


    public int carMileage() {
        mileage=22;
        return mileage;
    }


    public int carTopSpeed() {
        top_speed=220;
        return top_speed;
    }


    public int carYear() {
        yearOfManufacturing=2024;
        return yearOfManufacturing;
    }



}
