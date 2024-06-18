package Striver_DSA_SHEET.BasicMath;
// Easy one 
public class CountDigits {
    public static void main(String[] args) {
        int number = 77897777;
        System.out.println(Count_Digit(number));
    }

    public static int Count_Digit(int N){
        int count =0;
        while(N>0){
            N=N/10;
            count++;

        }
        return count;
    }
}
