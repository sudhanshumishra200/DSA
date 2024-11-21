package striver.BasicMath;
import java.util.ArrayList;
public class All_divisors {
    public static void main(String[] args) {
        All_divis(36);
    }

    public static void All_divis(int x){
        ArrayList <Integer> list = new ArrayList<>();
        for (int i=1; i<= Math.sqrt(x); i++){
            if (x % i==0){
                list.add(i);
                if (x/i != 1){
                    list.add(x/i);
                }
            }
        }
        System.out.println(list);
    }
} 
