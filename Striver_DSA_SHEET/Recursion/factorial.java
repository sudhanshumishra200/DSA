package Striver_DSA_SHEET.Recursion;

public class factorial {
    public static int factorialn(int n){
        // base case
        if(n==1){
            return 1;
        }
        int fact = n*factorialn(n-1);
        return fact;
    
    }
    public static void main(String [] args ){
        System.out.println(factorialn(13));
    }
}
