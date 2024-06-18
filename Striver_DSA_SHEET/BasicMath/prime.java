package Striver_DSA_SHEET.BasicMath;

public class prime {
    public static void main(String[] args) {
        System.out.println(Prime_check(2));
    }

    public static boolean Prime_check(int n){
        int count =0;
        for (int i=1; i<=n; i++ ){
            if (n%i == 0){
                count ++;
            }
        }

        if (count == 2){
            return true;
        }
        else {
            return false;
        }
    }
}
