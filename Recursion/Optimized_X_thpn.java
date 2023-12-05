// Optimized solution for X to the power n with 
// Time complexcity = O(log n)
public class Optimized_X_thpn {

    public static int OptimizedPow(int x, int n) { // function
        if (n == 0) {
            return 1;
        }
        // for even case
        int halfPow = OptimizedPow(x, n / 2);
        int halfPowsq = halfPow * halfPow;
        // odd case
        if (n % 2 != 0) {
            halfPowsq = x * halfPowsq;
        }
        return halfPowsq;

    }

    public static void main(String args[]) {

        System.out.println(OptimizedPow(2, 11));

    }
}
