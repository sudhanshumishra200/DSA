package Striver_DSA_SHEET.PATTERNS;
// Pattern - 8: Inverted Star Pyramid
// Input Format: N = 3
// Result: 
// *****  
//  ***
//   *   
// Input Format: N = 6
// Result:     
// ***********
//  *********
//   *******
//    ***** 
//     ***    
//      *
public class Qs8_Pattern {
    public static void pattern8(int N){
        //outer loop : for number of rows 
        for(int i=1; i<=N; i++){
            //inner loop : for number of columns
            //for spaces
            for (int j=1; j<i; j++){
                System.out.print(" ");
            } // for star printing
            for(int k=1; k<=2*N -(2*i)+1;k++ ){
                System.out.print("*");
            }
            // for spaces
            for (int j=1; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern8(6);
    }

    //add two number
    
    
}
