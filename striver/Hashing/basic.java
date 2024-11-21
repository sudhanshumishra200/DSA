package striver.Hashing;
import java.util.*;
public class basic {
   
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the no of element: ");
        n= sc.nextInt();
        System.out.println("Enter the element: ");

        // initialize the array to store the element;
        int arr[]= new int[n];
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        // Find the maximum value in the array to determine the size of the hash array
        int maxValue = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        //Initialze the hash array
        int hash[]= new int[13];
        //pre compute the occurance of the elements in the array
        for (int i=0; i<n; i++){
            hash[arr[i]]+= 1;
        }

        //Input the number of queries
        int q;
        System.out.println("Enter the no of queries: ");
        q=sc.nextInt();
        System.out.println("Enter the queries");
        while (q-- > 0){
            int number;
            number =sc.nextInt();
            //fetch
            if (number <= maxValue) {
                System.out.println(hash[number]);
            } else {
                System.out.println(0);
            }
        }



    }
}
