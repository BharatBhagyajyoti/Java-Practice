package nareshit.lab.dt07_02_25_Collection;
//Write a program to reverse ArrayList in java?


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(12);
        arr.add(10);
        arr.add(65);
        arr.add(9);
        System.out.println(arr);

        Collections.reverse(arr);
        System.out.println(arr);
//        System.out.println(arr.reversed());
    }
}
