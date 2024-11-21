package striver.PATTERNS;
//Pattern-5: Inverted Right Pyramid
// Input Format: N = 3
// Result: 
// * * *
// * * 
// *
// Input Format: N = 6 
// Result:
// * * * * * *
// * * * * * 
// * * * * 
// * * * 
// * * 
// *
// The inner loop will run in decreasing order of stars, for eg: Row 1 (i=0) would contain N stars, Row 2 (i=1) would contain (N -1) stars and so on.

public class Qs5_Pattern {
    public static void pattern5(int N){
        //outer loop: rows
        for (int i=0; i<N; i++){ 
            //inner loop
            for (int j=1; j<N-i; j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern5(6);
    }
    
}
