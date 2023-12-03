public class factorial {
    public static int factorial(int n) {  //public static -access modifier 
    if (n== 0 || n==1){
        return 1;
    }

     
     return n = n*factorial(n-1);

    }
    public static void main (String args[]){

    int n = 5;
    int fact =factorial(n);
    System.out.println(fact);
}
    
}
