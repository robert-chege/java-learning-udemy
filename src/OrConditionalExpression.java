public class OrConditionalExpression {
    public static void main(String args[]) {
        double account_balance = 1050000;
        int age = 55;

//        if conditional execution with OR
        if (account_balance >= 1000000 || age >= 65) {
            System.out.println("You can retire now. Good Luck!");
        } else {
            System.out.println("You still need to save money for retirement");
        }

    }
}
