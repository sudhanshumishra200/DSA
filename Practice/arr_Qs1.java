package Practice;

import java.util.Scanner;

public class arr_Qs1 {

     /*Take an array as input from the user. Search for
     a given number x and print the index at which it occurs. */

     public static void main(String[] args){

        int key;
        int arr[]= new int[5];
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the element of the array: ");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter the search key: ");
        key= sc.nextInt();
        sc.close();

        // search for a given number 

        for (int i=0; i<arr.length; i++ ){
            if(arr[i]==key){
                System.out.println("The element is at index: "+ i);
            }
        }
        
     }
}
