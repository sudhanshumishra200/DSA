/*  Problem 14: Asked in Paytm*/
// Print all binary strings of size N without consecutives ones

public class Binary_string {

    public static void printBinString(int n, int lastplace, String str) {
        // Base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // kaam
        printBinString(n - 1, 0, str + "0");
        if (lastplace == 0) {
            printBinString(n - 1, 1, str + "1");

        }

    }

    public static void main(String args[]) {
        printBinString(5, 0, "");
    }

}
