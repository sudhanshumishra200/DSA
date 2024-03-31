package Striver_DSA_SHEET.PATTERNS;
// Pattern - 10: Half Diamond Star Pattern
// Input Format: N = 3
// Result: 
//   *  
//   **
//   ***  
//   **
//   *   
// Input Format: N = 6
// Result:   
//      *
//      **
//      *** 
//      ****
//      *****
//      ******  
//      *****
//      ****
//      ***    
//      **
//      *
public class Qs10_Pattern {
    public static void pattern10(int N){
        //outer loop
        for (int i=1; i<=N; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            // System.out.println();
        }
        for(int j=1; j<=N; j++){
            //inner loop
            for (int k=1; k<=N-j; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        pattern10(3);
    }
    
}
