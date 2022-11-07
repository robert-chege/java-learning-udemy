package polymorphism;

public class Mortobike extends Vehicle {
    public Mortobike(String make, String model, int year) {
        super(make, model, year);
    }

    //    start method
    public void start() {
        System.out.println(String.format("%s %s %d starting", getModel(), getModel(), getYear()));
    }

    // stop method
    public void stop() {
        System.out.println(String.format("%s %s %d stopping", getMake(), getModel(), getYear()));
    }

}



