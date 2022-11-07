package abstraction;

public class AbstractionExample {
    public static void main(String args[]){
        Employee emp1 = new Employee();
        emp1.setEmpId("123123");
        emp1.setName("Johnie");
        emp1.setAddress("4176 Houston Avenue");
        System.out.println(emp1.getCustomerInfo());
    }
}
