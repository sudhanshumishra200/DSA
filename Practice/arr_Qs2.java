package Practice;
//Find the maximum & minimum number in an array of integers.
import java.util.Scanner;

public class arr_Qs2 {
    public static void main(String[] args){
        int arr[] = new int[5];
    
    System.out.println("Enter the element of the array");
    Scanner sc = new Scanner(System.in);

    // taking input from user
    for(int i=0; i<arr.length; i++){
        arr[i]= sc.nextInt();
    }
    sc.close();

    int max= Integer.MIN_VALUE; // its value is -infinite
    int min= Integer.MAX_VALUE; // its value is infinite

    for (int i=0; i<arr.length; i++){
        if(arr[i] >max){
            max= arr[i];
        }else if(arr[i] <min){
            min  =arr[i];
        }
    }
    System.out.println("The maximum element of the array is:- "+ max+ " and the minimum element of the array is:- "+ min);



    }
}
