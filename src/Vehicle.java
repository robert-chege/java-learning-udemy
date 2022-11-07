public class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start(){
        System.out.println("I am Starting");
    }
}
