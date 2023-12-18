// find no. of ways to reach from (0,0) to (n-1,m-1) grid .
// Allowd moves -> Right or Down
// TC = O(2^n+m) exponential 
public class Grid_ways {
    public static int gridways(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == n - 1) { // last cell cond
            return 1;
        } else if (i == n || j == n) { // boundary cross cond
            return 0;
        }

        // kaam
        int w1 = gridways(i + 1, j, n, m);
        int w2 = gridways(i, j + 1, n, m);
        return w1 + w2;

    }

    public static void main(String args[]) {

        int n = 3, m = 3;
        System.out.println(gridways(0, 0, n, m));

    }

}
