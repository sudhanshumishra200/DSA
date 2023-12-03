public class daimond {
    public static void daimond(int n){
        //for first half 
        for (int i=1; i<=n; i++){
            //for space printing cond (n-i)
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //for stars printing (2i-1) will be cond because all stars are odd 
            for (int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // for next half cond will be opposite loop run from n to 1

        for (int i=n; i>=1; i--){
            //for spaces printing
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //for stars printing (2i-1) will be cond because all stars are odd 

            for (int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String args[]){
        daimond(4);
    }
}
