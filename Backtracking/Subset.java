// Prb:- Find and print all subset of a given sring
// eg. "abc":- a,b,c,ab,bc,ac,abc

public class Subset {

    public static void PrintSubset(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.print("null"); // To print null at the null subset
            } else {
                System.out.println(ans);
            }

            return;
        }
        // recursion
        // choice -Yes
        PrintSubset(str, ans + str.charAt(i), i + 1);
        // No
        PrintSubset(str, ans, i + 1);

    }

    public static void main(String args[]) {
        String str = "abc";
        PrintSubset(str, "", 0);

    }

}
