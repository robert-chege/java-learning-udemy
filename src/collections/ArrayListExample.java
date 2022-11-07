package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String args[]) {
//       Non Generic ArrayList
        List arrayList1 = new ArrayList();
        arrayList1.add("String");
        arrayList1.add(2);
        arrayList1.add(false);
        System.out.println(arrayList1);
        arrayList1.remove(0);
        System.out.println(arrayList1);

//        Non Generic ArrayList
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("String2");
        arrayList2.add(3);
        arrayList2.add(true);
        System.out.println(arrayList2);
        arrayList2.remove(0);
        System.out.println(arrayList2);

//        Generic ArrayList
        List<String> arrayList3 = new ArrayList<String>();
        arrayList3.add("String1");
        arrayList3.add("String2");
        arrayList3.add("String3");
        System.out.println(arrayList3);
        arrayList3.remove(0);
        System.out.println(arrayList3);

//        Generic ArrayList
        ArrayList<String> arrayList4 = new ArrayList<String>();
        arrayList4.add("String1");
        arrayList4.add("String2");
        arrayList4.add("String3");
        System.out.println(arrayList4);
        arrayList4.remove(0);
        System.out.println(arrayList4);

//        Generic ArrayList
        List<Double> arrayList5 = new ArrayList<Double>();
        arrayList5.add(4.786);
        arrayList5.add(6.98);
        arrayList5.add(7.967);
        System.out.println(arrayList5);
        arrayList5.remove(0);
        System.out.println(arrayList5);
    }
}
