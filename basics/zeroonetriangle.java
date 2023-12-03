public class zeroonetriangle {
    public static void  zero_one_triangle(int n){
        //for outer loop
        for(int i=1; i<=n; i++){
            //for inner loop
            for(int j=1; j<=i; j++){
                //cell condition for printing 1
                if ((i+j)%2 ==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            //for next line 
            System.out.println();
        }
    }
    public static void main(String args[]){
        zero_one_triangle(10);
    }
}
