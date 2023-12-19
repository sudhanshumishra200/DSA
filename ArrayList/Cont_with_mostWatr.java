
// For a given n lines on X- axis , use 2 lines form a container such that it holds maximum water
// height = [1,8,6,2,5,4,8,3,7]
// This is a brute force approach
//TC = O(N^2)
import java.util.*;

public class Cont_with_mostWatr {
    // water store method
    public static int waterStore(ArrayList<Integer> height) {
        int Max_water = 0;
        // brute Force
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int wt = j - 1;
                int currwater = ht * wt;
                Max_water = Math.max(Max_water, currwater);
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
