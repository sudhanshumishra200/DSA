java.util.*;

package striver.Hashing;

public class hash_set {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();

        // Adding elements to the set
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        // Checking if an element exists in the set
        System.out.println(set.contains(3)); // Output: true
    }
}
