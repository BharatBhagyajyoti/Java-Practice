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
        System.out.println("Bread is :"+type);
        System.out.println("A slice of bread has \n" +this.proteins+" gms of protein\n"+this.fats+" gms of fats\n"+this.carbs+" gms of carbohydrates.");
        System.out.println("Taste Score: "+tastyScore);
    }
}
