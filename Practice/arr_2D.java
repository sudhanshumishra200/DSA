package Practice;

import java.util.Scanner;
// creating a 2d array
//Taking a matrix as an input and printing its elements.
public class arr_2D {
     public static void main(String[] args){
        int arr[][] = new int[3][3];
        // int row;
        // int col;,,

        System.out.println("Enter the value of matrix");
        Scanner sc= new Scanner(System.in);

        //input
        for(int i=0; i<3; i++){ // for rows
            for(int j=0; j<3; j++){ // for column
                arr[i][j]= sc.nextInt();
            }
        }
        sc.close();

        //print 
        for (int i=0; i<3; i++){ // row
            for(int j=0; j<3; j++){// column
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }



    }
}
