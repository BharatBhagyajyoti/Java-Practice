package nareshit.lab.dt26_11_24.q1;

public class Engine {
    private String model;

    public Engine(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return  model  ;
    }
}
