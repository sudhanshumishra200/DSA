public class Sum_of_n_natural {

    public static int Sum(int n) { // T.C == O(n) , S.C == O(n)
        if (n == 1) {
            return 1;
        }
        int snm1 = Sum(n - 1);
        int fn = n + Sum(n - 1);

        return fn;

    }

    public static void main(String args[]) {
        int n = 5;
        System.out.print(Sum(n));
    }

}
