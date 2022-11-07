public class voidMethod {
    public static void main(String args[]){
        greet("John");
        greet("Kevo");
        greet("Kim");
        greet("Bree");
    }

    public static void greet(String name){
        System.out.println(String.format("Hello, %s", name));
    }
}
