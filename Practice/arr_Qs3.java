package Practice;
// Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//        {3, 4, 6, 2} is not sorted in ascending order.

import java.util.Scanner;

public class arr_Qs3 {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
    
    System.out.println("Enter the element of the array");
    Scanner sc = new Scanner(System.in);

    // taking input from user
    for(int i=0; i<arr.length; i++){
        arr[i]= sc.nextInt();
    }
    sc.close();
    boolean  isSorted =true;
    for (int i=0; i<arr.length-1; i++){
        if (arr[i] > arr[i+1]){ // This is the conndition for descending order
            isSorted= false;
        }
    }

    if (isSorted == true){
        System.out.println("The given array is sorted in ascending order :");
    }else{
        System.out.println("The given array is not sorted in ascending order :");
    }
    }
}
