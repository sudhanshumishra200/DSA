package striver.Recursion;

public class string_palindrome {

    public static boolean palindrome( int i, String S, int n){
        //base case 
    if (i >= n/2){
        return true;
    }
    if (S.charAt(i) != S.charAt(S.length()-i-1)){
        return false;
    }
     return palindrome(i+1,S,n);

    }
    
    public static void main(String[] args) {
        String S= "raceacar";
        int n=S.length();
        System.out.println(palindrome(0, S,n));
    }
}
