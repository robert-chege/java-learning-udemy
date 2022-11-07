public class BooleanMethod {
    public static void main(String args[]){
        System.out.println(isEven(45));
        System.out.println(isEven(34));
        System.out.println(isEven(26));
    }
    public static Boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }
}
