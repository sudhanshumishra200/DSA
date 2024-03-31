package Striver_DSA_SHEET.PATTERNS;
// Pattern - 4: Right-Angled Number Pyramid - II
// Input Format: N = 6
// Result:
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5
// 6 6 6 6 6 6

public class Qs4_Pattern {
    static void pattern3(int N){
        // outer loop : rows
        int count =1;
        for (int i=0; i<N; i++){
            //inner loop
            for (int j=0; j<=i; j++){
                System.out.print(count +" ");
            }
            System.out.println();
            count++;
        }
    }
    public static void main(String[] args) {
        int n=5;
        pattern3(n);
    }
}
