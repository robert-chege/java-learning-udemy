public class StringInterpolation {
    public static void main(String args[]){
        String custName = "Kevin";
        int age = 45;
        String streethouse = "4131 California Avenue";

        System.out.println(String.format("Student Details: Name: %s, Age: %d, Address: %s",custName, age, streethouse));
    }
}
