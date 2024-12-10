package nareshit.lab.dt10_12_24.q2;

public class Bread extends Food{

    int tastyScore;
    String type ;
    public Bread(double proteins,double fats,double carbs) {
        super.proteins=proteins;
        super.fats=fats;
        super.carbs=carbs;

        tastyScore = 8;
        type = "vegetarian";
    }

    @Override
    void getMacroNutrients() {
        System.out.println("A slice of bread has \n" +super.proteins+" gms of protein\n"+super.fats+" gms of fats\n"+super.carbs+" gms of carbohydrates.");

    }
}
