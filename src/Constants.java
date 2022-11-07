public class Constants {
    public static String name;
    public static final double PI = 3.14;
}
class ConstantMethod {
    public static void main(String args[]){
        Constants.name = "Kevin";
        System.out.println(Constants.name);
        System.out.println(Constants.PI);
    }
}