import java.util.*;
public class subarray {

    public static void sub_array(int numbers[]){
        //print sub array
        int ts= 0;
        for (int i=0; i<numbers.length; i++){
            int start =i;
            for(int j=i; j<numbers.length; j++){
                int end =j;
                for (int k=start; k<=end; k++){ // print
                    System.out.print(numbers[k]+" ");// print sub array 
                }
                ts ++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of subarrays are "+ ts);
    }
    public static void main(String args[]){
        int numbers[]= {2, 4, 6, 8, 10};
        sub_array(numbers);
    }

}
    
