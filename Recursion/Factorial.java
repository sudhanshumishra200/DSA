public class Factorial {

    public static int fact(int n) {// T.C == O(n) , S.C == O(n)
        if (n == 0) { // because factorial of 0! == 1
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fact(n - 1);

        return fn;

    }

    public static void main(String args[]) {
        int n = 4;
        // fact(n);
        System.out.print(fact(n));
    }

}
