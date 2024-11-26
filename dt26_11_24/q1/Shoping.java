package nareshit.lab.dt26_11_24.q1;

import nareshit.lab.dt26_11_24.q2.Customer;
import nareshit.lab.dt26_11_24.q2.Order;

public class Shoping {
    public static void main(String[] args) {
        Order or=new Order("BBMOD0920001287222","Milk Can");
        Customer c1= new Customer("Suraj Biswal","biswalsuraj1724@gmial.com",or);
        System.out.println(c1);
    }
}
