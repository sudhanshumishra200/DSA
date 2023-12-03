import java.util.*;
//package 2dArrays;

public class array {
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {// for rows - outer loop
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.print("Key found at :" + "(" + i + "," + j + ")");
                    return true;

                }

            }

        }

        System.out.print("The key does not exist :");
        return false;
    }

    public static void main(String args[]) {
        int n = 3, m = 3;
        System.out.print("Enter the elements of matrix :");
        int matrix[][] = new int[n][m];
        Scanner sc = new Scanner(System.in);

        // input
        for (int i = 0; i < matrix.length; i++) {// for rows - outer loop
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }

        }

        // for output
        for (int i = 0; i < matrix.length; i++) {// for columns - inner loop
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

        }

        System.out.print("Enter the key value :");
        int k;
        k = sc.nextInt();

        search(matrix, k);

    }

}
