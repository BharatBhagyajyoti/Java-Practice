package nareshit.lab.dt07_02_25_Collection;
//Write a program to remove element from ArrayList which contains only numbers (ArrayList<Integer>)
//by using remove method of List interface as well as remove method of Collcetion interface.



import java.util.ArrayList;
import java.util.ListIterator;

public class RemoveElementFromArrayList {
    public static void main(String[] args) {
        ArrayList<Object> arr=new ArrayList<>();
        arr.add(12);
        arr.add("Bharat");
        arr.add(null);
        arr.add(9);
        System.out.println(arr);
        arr.remove(Integer.valueOf(12));


//        ListIterator<Object> l=arr.listIterator();
        System.out.println(arr);
        arr.remove(2);
    }
}
