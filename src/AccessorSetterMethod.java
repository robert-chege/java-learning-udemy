public class AccessorSetterMethod {
    public static void main(String args[]){
        Car c1 = new Car( "Ford", "Taurus", 2021);
        System.out.println(c1.getMake());
        System.out.println(c1.getModel());
        System.out.println(c1.getYear());

//        set to new value
        c1.setMake("Toyotata");
        c1.setModel("RAV 4");
        c1.setYear(2015);

        System.out.println(c1.getMake());
        System.out.println(c1.getModel());
        System.out.println(c1.getYear());


    }
}
