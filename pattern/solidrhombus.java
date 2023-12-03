public class solidrhombus{
    public static void solid_rhombus(int n){
        //for oouter loop
        for (int i=1; i<=n; i++){
            //inner cell -- spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //inner cell star print
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String args[]){
        solid_rhombus(5);
    }

}