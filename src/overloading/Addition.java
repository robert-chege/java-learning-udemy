package overloading;

public class Addition {
    //    Addition of two integers
    public int add(int a, int b) {
        return a + b;
    }

    //    Addition of three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    //    Addition of double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String args[]){
        Addition a = new Addition();
        System.out.println(a.add(12,12));
        System.out.println(a.add(12,12, 12));
        System.out.println(a.add(12.24,12.24));
    }
}
