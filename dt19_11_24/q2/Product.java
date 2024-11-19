package nareshit.lab.dt19_11_24.q2;

public class Product {
    protected String name;
    protected double price;

    public Product(String name,double price)
    {
        this.name=name;
        this.price=price;

    }

    void displayInfo(){
        System.out.println("Product name :"+name);
        System.out.println("Price :"+price);
    }

    double calculateTotalCost(int quantity)
    {
        return quantity*price;
    }
}
