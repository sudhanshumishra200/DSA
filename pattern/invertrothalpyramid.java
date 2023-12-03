public class invertrothalpyramid {


    public static void inverted_rotated_half_pyramid(int n){
        //for outer loop or line 
        for(int i=1; i<=n; i++){
            //for space 
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            //for star 
            }for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        inverted_rotated_half_pyramid(10);

    }
}