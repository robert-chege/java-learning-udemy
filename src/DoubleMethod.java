public class DoubleMethod {
    public static void main(String args[]){
        System.out.println(add(50, 60));
        System.out.println(add(60, 70));
        System.out.println(add(60.0,50));

    }
    public static double add(double num1, double num2){
        return num1 + num2;
    }
}
