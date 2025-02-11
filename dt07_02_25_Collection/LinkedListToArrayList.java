package nareshit.lab.dt07_02_25_Collection;

//Write a program to convert LinkedList to ArrayList?


import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArrayList {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(10);
        ll.add(11);
        ll.add(12);
        ArrayList<Integer>arr=new ArrayList<>(ll);
        System.out.println("LinkedList :"+ll);
        System.out.println("Arraylist :"+arr);
    }
}
