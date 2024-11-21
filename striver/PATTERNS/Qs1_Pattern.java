package striver.PATTERNS;

// Problem Statement: Given an integer N, print the following pattern.
// Input: N = 3
// * * *
// * * *
// * * *


public class Qs1_Pattern {
    public static void main(String[] args) {
        int rows=3;
        int col =3;
        //outer loop : for rows
        for(int i=0; i<rows; i++){
            //inner loop :for col
            for(int j=0; j<col; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
