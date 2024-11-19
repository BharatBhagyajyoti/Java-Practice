package nareshit.lab.dt19_11_24.q2;

public class Electronics extends Product{
    private String brand;

    public Electronics(String brand,String name,double price)
    {
        super(name,price);
        this.brand=brand;
    }
    void displayInfo()
    {
        super.displayInfo();
        System.out.println("Brand :"+brand);
    }


}
