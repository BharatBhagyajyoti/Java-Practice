package nareshit.lab.dt_05_12_24.q1;

public class ZooSimulation {
    public static void main(String[] args) {
        System.out.println("System.out.println(\"ANIMAL\\n========\");");
        Mammal a1=new Mammal("Lion",false);
        String sp=a1.getSpecies();
        System.out.println("Species:"+sp);
        a1.makeSound();
        a1.nurseYoung();
        Animal a2=a1.reproduce();
        System.out.println(a1);
        System.out.println("Baby:"+a2);

        System.out.println("----------------------------------------");
        System.out.println("BIRD\n========");
        Bird b1=new Bird(true,"Eagle");
        String sp1=b1.getSpecies();
        System.out.println("Species:"+sp1);
        b1.makeSound();
        b1.buildNest();
        Animal b2=b1.reproduce();
        System.out.println(b1);
        System.out.println("Baby:"+b2);
    }
}
