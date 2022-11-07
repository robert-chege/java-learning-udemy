package Inheritance;

public class InheritanceExample2 {
    public static void main(String args[]){
//        call box
        Box box1 = new Box(9, 10);
        box1.displayBoxName();

//        call small box
        SmallBox box2 = new SmallBox(10, 11);
        box2.displayBoxName();
        box2.printArea();

//        call big box
        BigBox box3 = new BigBox(9, 10, 23);
        box3.displayBoxName();
        box3.printArea();

    }
}
