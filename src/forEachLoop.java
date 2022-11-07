public class forEachLoop {
    public static void main(String args[]){
        String[] celebrities = {"Bruno Mars", "Taylor Swift", "Max Smith", "Eminem"};
        for(String name:celebrities){
            System.out.print(name);
            System.out.print(",");
        }
        System.out.print("\n");

        int[] age = {20, 22, 24, 33};
        for(int x:age){
            System.out.println(x);
            System.out.println(",");
        }
    }
}
