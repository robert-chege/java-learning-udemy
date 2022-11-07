public class AccessorGetterMethod {
    public static void main(String args[]){
        Automobile a1 = new Automobile( "Ford", "Taurus", 2021);
        System.out.println(a1.getMake());
        System.out.println(a1.getModel());
        System.out.println(a1.getYear());

    }
}
