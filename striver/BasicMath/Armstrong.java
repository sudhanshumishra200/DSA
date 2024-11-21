package striver.BasicMath;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println(armstrong_No(123));
    }

    public static boolean armstrong_No(int x){
        int dup = x;
        int sum = 0;
        while (x != 0){
            int ld = x % 10;
            sum = sum + (ld * ld * ld);
            x= x/10;
        }
        if (dup == sum){
            return true;
        }else{
            return false;
        }

    }
}
