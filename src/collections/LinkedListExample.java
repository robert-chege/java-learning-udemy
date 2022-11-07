package collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String args[]){
//        Create Non generic Linked list
        List linkedList1 = new LinkedList();
        linkedList1.add("String1");
        linkedList1.add(2);
        linkedList1.add(false);
        System.out.println(linkedList1);
        linkedList1.remove(1);
        System.out.println(linkedList1);
        linkedList1.removeAll(linkedList1);
        System.out.println(linkedList1);

//        generic
//        List<String> linkedList2 = new LinkedList<String>();
    }
}
