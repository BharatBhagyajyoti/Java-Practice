package nareshit.lab.dt07_02_25_Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class TraverseBothDirection {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(12);
        arr.add(10);
        arr.add(65);
        arr.add(9);

        ListIterator<Integer>li=arr.listIterator();

        System.out.println("Forward Iterate");
        while (li.hasNext())
        {
            System.out.println(li.next());
        }
        System.out.println("Backward Iterate");
        while (li.hasPrevious())
        {
            System.out.println(li.previous());
        }
    }
}
