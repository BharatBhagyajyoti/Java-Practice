package nareshit.lab.dt14_11_24.q1;

public class Mammal extends Animal{


    private boolean hasFur;

    public Mammal(String name, boolean hasFur) {
        super(name);
        this.hasFur = hasFur;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public void displayDetails()
    {
        super.displayDetails();
//        if (hasFur==true)
        System.out.println("HasFur :"+hasFur);
    }
}
