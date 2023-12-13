// Friends pairing problem
// Asked in goldman sachs
//Q.  Given n friends, each one can remain single or can be paried up with some other friend. Each friend can pair only once.Find out the total no of ways in which friends can remain single or can be paired up.
//GoldmanSachs

public class Friends_pairing {

    public static int friendsPairing(int n) {
        // Base case
        if (n == 1 || n == 2) {
            return n;
        }
        // choice
        // single (n-1) people left

        int fnm1 = friendsPairing(n - 1);

        // pair
        int fnm2 = friendsPairing(n - 2);
        int pairways = (n - 1) * fnm2;

        int totways = fnm1 + pairways;

        return totways;

    }

    public static void main(String args[]) {

        System.out.println(friendsPairing(5));

    }

}
