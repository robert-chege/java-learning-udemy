public class Automobile {
    String make;
    String model;
    int year;

//    Constructor method with parameters
    public Automobile(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

//    getter methods
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
}
