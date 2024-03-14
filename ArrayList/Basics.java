
// operation on ArrayList 
import java.util.ArrayList;

public class Basics {
    public static void main(String args[]) {
        // java collection Framework part
        // className ObjectName = new className()
        // how to define ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list); // O(1)

        //// Get operation O(1)
        // int element = list.get(3);
        // System.out.println(element);
        //
        //// Delete operation O(n)
        // list.remove(3);
        // System.out.print(list);
        //
        //// set element at index

        // list.set(2, 10); // O(n)
        // System.out.println(list);

        // contains element
        // System.out.println(list.contains(2)); // O(n)
        // System.out.println(list.contains(11));
        list.add(3, 11);
        System.out.println(list);

        // size of an AL
        System.out.println(list.size()); // .size()is a method

        // print array list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

    }

}
