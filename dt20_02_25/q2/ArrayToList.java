package nareshit.lab.dt20_02_25.q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static List convertToList (String [] inputArray)
    {
        List<String> list=Arrays.asList(inputArray);
        int arrLength=inputArray.length;
        int lLength=list.size();
       if (arrLength==lLength)
       {
           return list;
       }
       return null;
    }
}
