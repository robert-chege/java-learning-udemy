public class ConstructorMethod101 {
//    constructor Method
    public ConstructorMethod101(){
        System.out.println("This is constructor method");
    }

//    Constructor method with parameters
    public ConstructorMethod101(String param){
        System.out.println("This is constructor method with parameter" + param);
    }
//    instance method
    public void InstanceMethod(){
        System.out.println("This is instance method");
    }
}

class ConstructorMethodExample {
    public static void main(String args[]){
//  Create object method with default constructor
        ConstructorMethod101 method1 = new ConstructorMethod101();
        method1.InstanceMethod();

//        Create object method2 with constructor having parameter
        ConstructorMethod101 method2 = new ConstructorMethod101("constructor");
        method2.InstanceMethod();
    }
}
