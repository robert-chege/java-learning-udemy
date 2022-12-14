package polymorphism;

public class PolymorphismMethod {
    public static void main(String args[]) {
//        create object from parent class
        Vehicle v1 = new Vehicle("Ford", "F150", 2012);
        v1.stop();

//        create SUV object
        SUV v2 = new SUV("Toyota", "RAV4", 2016);
        v2.start();
        v2.stop();

//        Create semi object
        Semi v3 = new Semi("Volvo", "VML", 2010);
        v3.start();
        v3.stop();

//        Create Motorbike object
        Mortobike v4 = new Mortobike("Harley", "Samson", 2011);
        v4.start();
        v4.stop();

    }
}
