package nareshit.lab.dt07_02_25_Collection;

//Write a program to merge to Collection data which contains fruits name.

import java.util.LinkedList;
import java.util.Vector;

public class MergeCollections {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(10);
        ll.add(11);
        ll.add(12);
        System.out.println("LinkedList :"+ll);
        Vector<Integer>v=new Vector<>();
        v.add(0);
        v.add(1);
        System.out.println("Vector :"+v);
        ll.addAll(v);

        System.out.println("Merged Collection :"+ll);


    }
}
