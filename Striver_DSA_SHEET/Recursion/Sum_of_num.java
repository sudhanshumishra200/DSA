package Striver_DSA_SHEET.Recursion;

public class Sum_of_num {
    public static int Sum_of_first_N_number(int n){
        if (n<=0){
            return 0;
        }
        int sum = n + Sum_of_first_N_number(n-1);
        return sum;

    }
    public static void main(String[] args) {
       System.out.println( Sum_of_first_N_number(10));
    }
}
