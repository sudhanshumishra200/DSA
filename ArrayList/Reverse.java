import java.util.ArrayList;

public class Reverse {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // System.out.println(list);

        // // reverse
        // for (int i = list.size() - 1; i >= 0; i--) {
        // System.out.print(list.get(i) + " "); // O(n)
        // }

        // find maximum no
        int max_value = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (max_value < list.get(i)) {
                max_value = list.get(i);
            }
        }
        System.out.println(max_value);

    }

}
