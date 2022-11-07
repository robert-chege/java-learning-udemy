public class loops {
    public static void main(String args[]){
//        For loop
        for(int i = 0; i <= 10; i++){
            System.out.println("Number is: " + i);
        }
        System.out.println(" ");

//        While loop
        int i = 10;
        while(i >= 0){
            System.out.println("Number is: " + i);
            i--;
        }
        System.out.println(" ");

//        do while loop
        int count = 0;
        do{
            System.out.println("Number is: " + count);
            count++;
        } while(count <= 10);
        System.out.println(" ");
    }
}
