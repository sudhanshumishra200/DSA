// Two pointer approach
// optimized way O(n)

import java.util.ArrayList;

public class Pair_Sum2pA {

    // Two pointer approach
    public static boolean PairSum(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        while (lp != rp) {

            // case i:-
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // case 2:- lp+rp <target lp++
            else if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } // case 3:- lp+rp >target rp--
            else {
                rp--;
            }

        }

        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1,2,3,4,5,6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 4;

        System.out.println(PairSum(list, target));
    }

}
