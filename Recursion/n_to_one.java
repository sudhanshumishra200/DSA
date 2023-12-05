// Print number n to 1 ( decreasing order)
public class n_to_one {

    public static void printinc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        printinc(n - 1); // After reversing these tow line of code we can print things in increasing
                         // order
        System.out.print(n + " ");
    }

    public static void main(String args[]) {
        int n = 10;
        printinc(n);

    }

}
