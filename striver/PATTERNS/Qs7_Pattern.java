package striver.PATTERNS;
// Pattern - 7: Star Pyramid
// Input Format: N = 3
// Result: 
//   *  
//  *** 
// ***** 
// Input Format: N = 6
// Result:
//      *     
//     ***    
//    *****   
//   *******  
//  ********* 
// ***********
public class Qs7_Pattern {
    public static void pattern7(int N){
        //outer loop : for number of rows in pattern
        for ( int i=1; i<=N; i++){
            //Inner loop : for number of columns
            // for printing the space 
            for( int j=1; j<=N-i; j++){
                System.out.print(" ");
            }
            // for priinting the stars
            for(int k=1; k<=(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println(); 
        }
        
    }
    public static void main(String[] args) {
        pattern7(6);
    }
}
