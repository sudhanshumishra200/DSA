// Tiling problem in java  Problem statement :-
/*Given a "2*n" board or ( floor ) and tiles of size "2*1". count the number of ways 
to tile the given board or (floor) using the "2*1" tiles.(A tile can either be placed horizantally
or vertically) */
// This question has been asked in amazon 
//we can solve this question in DP for optimized solution
public class Tiling_Prob {

    public static int tilingproblem(int n) { // 2xn floor size
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // kaam
        // vertical choice
        int fnm1 = tilingproblem(n - 1);

        // horizantal choice

        int fnm2 = tilingproblem(n - 2);

        int totalways = fnm1 + fnm2;

        return totalways;
    }

    public static void main(String args[]) {
        System.out.println(tilingproblem(8));

    }

}
