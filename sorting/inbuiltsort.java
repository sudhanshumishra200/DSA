import java.util.Arrays;
import java.util.Collections;
public class inbuiltsort {
    // Arrays.sort(arr)
    public static void printarr(Integer arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main (String args[]){
        Integer arr[] ={5, 4, 1, 3, 2, 5, 23 ,22, 0};  // integer in cap because this array noe become an object 
       Arrays.sort(arr, Collections.reverseOrder());
        printarr(arr);
    }
}
