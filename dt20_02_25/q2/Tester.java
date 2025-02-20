package nareshit.lab.dt20_02_25.q2;

import java.util.List;
import java.util.Spliterator;

public class Tester {
    public static void main(String[] args) {
        String [] arr={"Bharat", "Raja", "Bubu"};
        List<String>list=ArrayToList.convertToList(arr);
        System.out.println("Array :");
        for (String s:arr)
        {
            System.out.print(s+"\t");
        }
        System.out.println("\nConverted List :"+list);
    }
}
