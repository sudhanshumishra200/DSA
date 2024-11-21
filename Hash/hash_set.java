import java.util.*;

public class hash_set {
    public static void main(String[] args) {
        // CREATING hash list
        HashSet<Integer> set = new HashSet<Integer>();

        set.add(1);
        set.add(2);

        //print all set
        // System.out.println(set);

        // //search - contains 
        // if ( set.contains(1)){
        //     System.out.println("Set contains 1");
        // }
        // if(!set.contains(4)){
        //     System.out.println("Set doeas not contain 4");

        // }
        // //delete
        // set.remove(1);
        // System.out.println(set);
        // //update
        // set.add(3);
        // System.out.println(set);

        // System.out.println(set.size());


        //iterator

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
