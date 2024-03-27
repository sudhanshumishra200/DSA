public class factorial {
    public static int Factorial(int n) {  //public static -access modifier 
    if (n== 0 || n==1){
        return 1;
    }

     
     return n = n*Factorial(n-1);

    }
    public static void main (String args[]){

    int n = 5;
    int fact =Factorial(n);
    System.out.println(fact);
}
    
}
