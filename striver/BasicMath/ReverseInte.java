package striver.BasicMath;

public class ReverseInte {
    public static void main (String[] args){
        System.out.println(ReverseInteger(123));
    }

    public static int ReverseInteger(int n){
        int rev =0;
        while (n != 0) {
            int ld =n % 10;
            rev =rev * 10 +ld;
            n = n / 10;
    
        }
        return rev;
    }
}



