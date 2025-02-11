package nareshit.lab.dt11_01_25_Collection.q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



/*
Sorting by implementing Comparable
 */
public class TestProduct {
    public static void main(String[] args) {
        ArrayList<Product> arr=new ArrayList<>();
        arr.add(new Product(123,"Realme 12 pro",22999));

        arr.add(new Product(423,"Iphone 17",87999));
        arr.add(new Product(9878,"VIVO X50",35999));
        arr.add(new Product(434,"RedMagic",67999));

//        Iterator itr=arr.iterator() ;
        arr.forEach((n)-> System.out.println(n));

        System.out.println("------------------After Sorting(Using compareTo())-----------------------");
        Collections.sort(arr);
        arr.forEach((n)-> System.out.println(n));


    }
}
