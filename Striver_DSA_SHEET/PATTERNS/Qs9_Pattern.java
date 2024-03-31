package Striver_DSA_SHEET.PATTERNS;
// Pattern - 9: Diamond Star Pattern
// Input Format: N = 3
// Result: 
//   *  
//  ***
// ***** 
// *****  
//  ***
//   *   
// Input Format: N = 6
// Result:   
//      *
//     ***
//    ***** 
//   *******
//  *********
// ***********  
// ***********
//  *********
//   *******
//    ***** 
//     ***    
//      *

public class Qs9_Pattern {
    public static void pattern9(int N){
        //for ouetr loop: Rows
    for (int i=1; i<=N; i++){

        //inner loop : Spaces
        for(int j=1; j<=N-i; j++){
            System.out.print(" ");
        }
        //for stars
        for(int k=1; k<= (2*i)-1; k++){
            System.out.print("*");
        }
        System.out.println();
    }
    // System.out.println();
    //outer loop : Rows
    for(int i=1; i<=N; i++){
        // for spaces
        for(int j=1; j<i; j++){
            System.out.print(" ");
        }
        //for stars
        for(int k=1;  k<=2*N -(2*i)+1; k++){
            System.out.print("*");
        }
        System.out.println();
    }

    }
    public static void main(String[] args) {
        int N = 6;
        pattern9(N);
    }
    
}
