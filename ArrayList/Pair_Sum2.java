
// Find if any pair in sorted and rotated arraylist has target sum 

import java.util.ArrayList;

public class Pair_Sum2 {
    public static boolean PairSum2(ArrayList<Integer> list, int target) {
        // find pivot point
        int n = list.size();
        int bp = -1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {// breaking point
                bp = i;
            }
        }

        int lp = bp + 1; // smallest
        int rp = bp; // largest

        // loop
        while (lp != rp) {
            // case 1:-
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }

            // case 2:-
            else if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n; // lp++

            } // case 3:-
            else {
                rp = (n + rp - 1) % n; // rp--
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // [11,15,6,8,9,10]
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 50;
        System.out.println(PairSum2(list, target));
        ;

    }

}
