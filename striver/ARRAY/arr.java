package striver.ARRAY;
import java.util.*;


// largest element in the array
public class arr {
    public static void main(String[] args){
        int arr[] = {2, 4, 6, 8, 10};
        int max = Integer.MIN_VALUE;

        for (int i=0; i< arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Largest element in the array is: " + max);
    }
}
