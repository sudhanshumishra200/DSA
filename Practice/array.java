package Practice;

import java.util.Scanner;

public class array {
    public static void main(String[] args){
        // Creating, Initializing, and Accessing an Arrays

        // both are valid declarations
        // int intArray[]; 
        // int[] intArray;

        //declaring array
        // int intArray[];
        // allocating memory to array
        // intArray = new int[20];  
        // combining both statements in one
        // int[] intArray = new int[20];

        // Declaring array literal 
        // int arr[] ={1,2,3,4,5};



        int arr[]= new int[5];
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the elements of array: ");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        printArray(arr);
        sc.close();

    }

    public static void printArray(int arr[]){ // code for printing array
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

    }
    
}
