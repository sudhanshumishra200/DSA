public class hollowrhombus {
    public static void hollow_rhombus(int n){
    ////for outer loop 
    for(int i=1; i<=n; i++){
        for (int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        //for inner cell
        for(int j=1; j<=n; j++){
            //only for printing edge stars
            if(i==1 || i==n || j==1 || j==n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }

        System.out.println();
    }
    }
    public static void main(String args[]){
        hollow_rhombus(5);
    }
    
}
