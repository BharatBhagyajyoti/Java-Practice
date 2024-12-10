package nareshit.lab.dt10_12_24.q2;

public class Egg extends Food{
    int tastyScore;
    String type ;
    public Egg(double proteins,double fats,double carbs) {
        super.proteins=proteins;
        super.fats=fats;
        super.carbs=carbs;
        tastyScore = 7;
        type = "non-vegetarian";
    }
    @Override
    void getMacroNutrients()
    {
        System.out.println("An egg has \n" +super.proteins+" gms of protein\n"+super.fats+" gms of fats\n"+super.carbs+" gms of carbohydrates.");
    }



}
