public class Car {
    String make;
    String model;
    int year;

    //    Constructor method with parameters
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    //    getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

//    Setter method
    public void setMake(String newMake){
        this.make = newMake;
    }
    public void setModel(String newModel){
        this.model = newModel;
    }
    public void setYear(int newYear){
        this.year = newYear;
    }
}