package nareshit.lab;

/*
write a java program to calculate the total surface area of a cylinder?
formula : 2*pi*r*(r+h)
*/

public class SurfaceAreaOfCyllinder {
    public static void main(String[] args) {
        float pi=3.14f;
        int h=10;
        int r=2;
        float area=(2*pi*r)*(r+h);
        System.out.println("Area of Cyllinder= "+area);
    }
}
