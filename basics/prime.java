import java.util.*;
public class prime {
     public static void main(String args[])
     {
        System.out.println("Enter the value of n :");
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
    
        if (n==2)
        {
            System.out.println("The given number is prime number ");
        }else{
            boolean isprime =true;
            for (int i=2; i<=Math.sqrt(n); i++){//To optimize the code we can use uder root n
            if (n % i == 0) {//n is multiple of i (not 1 and n)
            isprime = false;
            }
        }

        if (isprime ==true){
            System.out.println("The given number is a prime number. ");

        }else {
            System.out.println("The given number is not a prime number. ");
        }

        }
     }/// this program is made to check wether the given number is prime or not
}
