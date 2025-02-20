package nareshit.lab.dt20_02_25.q3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateTester {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        Duplicates d= new Duplicates(new ArrayList<>(Arrays.asList(11,12,11,10,56,12,45,66,66,56,11)));
        list=d.getDuplicatesList();
        System.out.println(list);
    }
}
