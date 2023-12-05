//WAP to print X to the power n
// T.C =O(n)  
public class X_thpow_n {

    public static int Pow(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * Pow(x, n - 1);
    }

    public static void main(String args[]) {

        System.out.println(Pow(2, 10));

    }

}
