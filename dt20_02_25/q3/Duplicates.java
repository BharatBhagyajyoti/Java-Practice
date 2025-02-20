package nareshit.lab.dt20_02_25.q3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {

    public Duplicates()
    {

    }

    public Duplicates(List<Integer>numberList)
    {
        this.numberList=numberList;
    }

    List<Integer>numberList=new ArrayList<>();

    public List<Integer> getNumberList() {
        return numberList;
    }

    public void setNumberList(List<Integer> numberList) {
        this.numberList = numberList;
    }



    public List getDuplicatesList()
    {
        List<Integer>numberList=this.numberList;
        System.out.println("numberList :"+numberList);
        int l=numberList.size();
        System.out.println("Length ="+l);
        Set<Integer>s=new HashSet<>();
        for (int i=0;i<l;i++)
        {
            int count=1;
            for (int j=i+1;j<l;j++)
            {
                if (numberList.get(i) == numberList.get(j) && !s.contains(i))
                {
;
                    count++;
                }
            }
//            System.out.println("Count : "+count);
            if (count>1)
                s.add(numberList.get(i));

        }
        return new ArrayList<>(s);
    }

}
