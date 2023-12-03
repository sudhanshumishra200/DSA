public class Fibonacci { // calculate nth term in fibnacci

    // Fibonacci function
    public static int GetFibonacci(int n) {
        // Two base cases
        if (n == 0 || n == 1) {
            return n;
        }

        int fibnm1 = GetFibonacci(n - 1);
        int fibnm2 = GetFibonacci(n - 2);
        int fibn = fibnm1 + fibnm2;
        return fibn;

    }

    public static void main(String args[]) {
        int n = 2;
        System.out.println(GetFibonacci(n));

    }

}
