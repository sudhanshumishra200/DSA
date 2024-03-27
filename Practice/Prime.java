package Practice;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        // take input from the user 
        int n;
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter your number: ");
        n= sc.nextInt();
        sc.close();
        
        
        // logic for the prime number
       if (n == 2){
        System.out.println("The given number is a prime number :");
       }else{
        boolean isprime =true;
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime =false;
            }
        }
       
       if (isprime ==true){
        System.out.println("The given number is a prime number :");
       }else{
        System.out.println("The given number is not a prime number :");
       }
    }


}


}
