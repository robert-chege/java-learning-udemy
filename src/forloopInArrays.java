public class forloopInArrays {
    public static void main(String args[]){
        double[] numlist = {121.4, 148.7, 304.4, 312.5};
//        Listing items in an array
        for(int i = 0; i < numlist.length; i++){
            System.out.println(numlist[i]);
        }

//        Finding sum of elements in array
        int sum = 0;
        for(int i = 0; i < numlist.length;i++){
            sum += numlist[i];
        }
        System.out.println("Sum is: " + sum);

//        Finding largest no in an array
        double max = numlist[0];
        for(int i = 1; i < numlist.length; i++){
            if(numlist[i] > max){
                max = numlist[i];
            }
        }
        System.out.println("The Largest no in the array is: "+ max);

    }

}
