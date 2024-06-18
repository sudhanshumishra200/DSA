package Striver_DSA_SHEET.Recursion;


public class print_1_toN {


    public static void Print_one_to_N(int n){
        //base case
        if (n<=0){
            return;
        }
        Print_one_to_N(n-1);
        System.out.print(n);
    }

    public static void main(String[] args) {
        Print_one_to_N(5);
    }
}
