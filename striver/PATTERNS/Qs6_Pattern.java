package striver.PATTERNS;
// Pattern - 6: Inverted Numbered Right Pyramid
// Input Format: N = 3
// Result: 
// 1 2 3
// 1 2
// 1

// Input Format: N = 6
// Result:
// 1 2 3 4 5 6
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2 
// 1

public class Qs6_Pattern {
    public static void pattern5(int N){
        //outer loop: rows
        for (int i=N; i>=0; i--){ // different way
            //inner loop
            for (int j=1;j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern5(6);
    }
    
}
