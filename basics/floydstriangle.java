public class floydstriangle {
    public static void floyds_Triangle(int n){
        int counter =1;
        //for outer loop or no of lines
        for (int i =1; i<=n; i++){
            //inner how many time counter will be printed 
            for (int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter ++;
            }
            System.out.println();

        }
    }
    public static void main(String args[]){
        floyds_Triangle(5);
    }
}
