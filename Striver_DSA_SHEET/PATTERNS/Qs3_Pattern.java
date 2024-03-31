package Striver_DSA_SHEET.PATTERNS;
// Pattern - 3: Right-Angled Number Pyramid
//Problem Statement: Given an integer N, print the following pattern : Problem Statement: Given an integer N, print the following pattern : 
//Input Format: N = 6
// Result:
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// 1 2 3 4 5 6
public class Qs3_Pattern {
    static void pattern3(int N){
        // outer loop : rows
        for (int i=0; i<N; i++){
            //inner loop
            int count =1;
            for (int j=0; j<=i; j++){
                System.out.print(count +" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        pattern3(n);
    }
}
