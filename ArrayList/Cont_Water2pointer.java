
//TC = O(n) linear
// Container with most water
// with 2 Pointer Approach:-
import java.util.*;

public class Cont_Water2pointer {
    // 2 Pointer Approach:-
    public static int waterStore(ArrayList<Integer> height) {
        int Max_water = 0;
        int Lp = 0;
        int Rp = height.size() - 1;
        while (Lp < Rp) {
            // calculate water area
            int ht = Math.min(height.get(Lp), height.get(Rp));
            int wt = Rp - Lp;
            int currwater = ht * wt;
            Max_water = Math.max(Max_water, currwater);

            // update ptr
            if (height.get(Lp) < height.get(Rp)) {
                Lp++;
            } else {
                Rp--;
            }

        }
        return Max_water;

    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(waterStore(list));
    }

}
