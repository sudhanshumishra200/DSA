
// BTUTE FORCE
// PRBLM :- Find if any pair in a sorted ArrayList has a target sum
//Target =5
// list [1,2,3,4,5,6]
import java.util.*;

public class Pair_Sum1 {

    public static int Pairsum(ArrayList<Integer> list, int target) {
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    count = count + 1;
                }

            }
        }
        return count;

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
        int target = 7;

        System.out.println(Pairsum(list, target));

    }

}
