package nareshit.lab.dt11_01_25_Collection.q2;

import nareshit.lab.dt11_01_25_Collection.q1.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TestCustomer {
    public static void main(String[] args) {

        ArrayList<Customer> arr=new ArrayList<>();
        arr.add(new Customer(123,"Bharat",22999));

        arr.add(new Customer(423,"Biswa",87999));
        arr.add(new Customer(9878,"Akhlad",35999));
        arr.add(new Customer(434,"Safalya",67999));


        System.out.println("----------Sort with customerNumber----------");
        Collections.sort(arr,(c1,c2)->c1.customerNumber.compareTo(c2.customerNumber));
        arr.forEach((n)-> System.out.println(n));

        System.out.println("\n----------Sort with customerName----------");
        Collections.sort(arr,(c1,c2)->c1.customerName.compareTo(c2.customerName));
        arr.forEach((n)-> System.out.println(n));

        System.out.println("\n----------Sort with customerBill----------");
        Collections.sort(arr,(c1,c2)->c1.customerBill.compareTo(c2.customerBill));
        arr.forEach((n)-> System.out.println(n));


    }


}
