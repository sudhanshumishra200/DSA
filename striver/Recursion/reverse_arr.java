package striver.Recursion;

import java.util.Scanner;
public class reverse_arr {
    public static void reverse(int i, int arr[], int n){
        //base case 
        if(i>= n/2){
            return;
        }
        //swap
        int temp = arr[i];
        arr[i]= arr[n-i-1];
        arr[n-i-1]=temp;
        //recursive call
        reverse(i+1, arr, n);
         
    }
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of element in array :");
        int n;
        n=sc.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter the number of elements: ");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        reverse(0, arr, n);
        //print 
        for (int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }

    }
}
