package accessmodifiers;

public class Customer {
    private int age = 40;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
// private method
    private void msg(String name){
        System.out.println(String.format("Hello %s", name));

    }
}

class PrivateExample{
    public static void main(String args[]){
        Customer customer1 = new Customer();
        System.out.println(String.format("Your age is: %s", customer1.getAge()));
//        customer1.msg("John");   private method cannot be instantiated in another class
    }
}


