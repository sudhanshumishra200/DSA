// sorting in array list  inbuilt method

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(8);
        list.add(9);
        list.add(3);
        list.add(2);
        list.add(5);

        System.out.println(list);
        Collections.sort(list); // sort in ascending order
        System.out.println(list);

        // descending order
        Collections.sort(list, Collections.reverseOrder()); // comparator :-fnx logic we can use for obj also
        System.out.println(list);

    }

}
