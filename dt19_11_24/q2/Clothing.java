package nareshit.lab.dt19_11_24.q2;

import javax.xml.transform.Source;

public class Clothing extends Product{
    private String size;

    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    void displayInfo()
    {
        super.displayInfo();
        System.out.println("Size :"+size);
    }

}
