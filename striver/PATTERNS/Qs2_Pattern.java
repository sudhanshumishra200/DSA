package striver.PATTERNS;
// Pattern-2: Right-Angled Triangle Pattern
// Problem Statement: Given an integer N, print the following pattern : 
// Input Format: N = 3
// Result: 
// * 
// * * 
// * * *
public class Qs2_Pattern {
    public static void main(String[] args) {
        int rows=5;
        
        //for rows : outer loop
        for (int i=0; i<rows; i++){
            //for col :inner loop
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
