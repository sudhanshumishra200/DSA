package Practice;
//Take a matrix as input from the user . Search for a given number
//x and print the indices at which it occures

import java.util.Scanner;

public class arr_2D_Qs1 {
     public static void main(String[] args){
        int arr[][] = new int[3][3];
        int key =4;
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

        //search
        for (int i=0; i<3; i++){ // row
            for(int j=0; j<3; j++){// column
                if (arr[i][j] == key){
                    System.out.println("The given number is at index "+ i+", "+j);
                }
            }
            System.out.println();
        }
}
}

