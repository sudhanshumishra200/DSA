// find permutation of strings "abc" :- input
// output :- abc, acb, bac, bca, cab,cba;
// TC :- O(n*n!)
public class Find_permutation {

    public static void perrmutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // abcde = "ab"+ "de"
            String newstr = str.substring(0, i) + str.substring(i + 1);
            perrmutation(newstr, ans + curr);
        }

    }

    public static void main(String[] args) {
        String str = "abc";
        perrmutation(str, " ");

    }

}
