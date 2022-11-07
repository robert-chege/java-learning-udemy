public class StringMethod {
    public static void main(String args[]){
        System.out.println(greet("John"));
        System.out.println(greet("Kevo"));
        System.out.println(greet("Kim"));
        System.out.println(greet("Bree"));
    }

    public static String greet(String name){
     return String.format("Hello, %s Welcome to Java class.", name);
    }
}
