package nareshit.lab.dt10_12_24.q2;

public class Testing {
    public static void main(String[] args) {
        Food f1=new Egg(10,5,18);
        f1.getMacroNutrients();
        System.out.println("\n\n\n");
        Food f2=new Bread(4,1.1,13);

        f2.getMacroNutrients();

    }
}
