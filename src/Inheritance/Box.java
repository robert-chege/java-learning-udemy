package Inheritance;

public class Box {
//    variables
    private int length;
    private int width;

//    constructor
    public Box(int l, int w){
        this.length = l;
        this.width = w;
    }

    public void displayBoxName(){
        System.out.println("I am a parent box class");
    }
}
