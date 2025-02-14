package nareshit.lab.dt14_02_25_Collection.q1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FruitInventoryManagement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        Map<String,Integer>fruits=new HashMap<>();
        fruits.put("Apple",50);
        fruits.put("Banana",30);
        fruits.put("Orange",20);
        System.out.println("Total entries in HashMap :"+fruits.size());

        if(fruits.isEmpty())
        {
            System.out.println("\nHashMap is empty");
//            System.out.println(fruits);
        }
        else {
            System.out.println("\nHashMap isn't empty");
            System.out.println(fruits);
        }

        System.out.println("\nEnter Fruit to search :");
        String sr=sc.next();

        if (fruits.containsKey(sr))
            System.out.println(sr + " is found in the HashMap");
        else
            System.out.println(sr+" isn't found in the HashMap");

        System.out.println("\nEnter quantity to search :");
        int qt=sc.nextInt();

        if (fruits.containsValue(qt))
            System.out.println("Quanity "+qt + " is found in the HashMap");
        else
            System.out.println("Quanity "+qt + " isn't found in the HashMap");


        System.out.println("Apple qty");
        int q= sc.nextInt();
        if (fruits.containsKey("Apple"))
        {
            Integer val=fruits.get("Apple");
            if (q<=val && q!=0)
                System.out.println(q+" qty. Apple found");

            else
                System.out.println(q+" qty. Apple not found");

        }

    }


}
