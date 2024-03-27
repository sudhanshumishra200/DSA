import java.util.Scanner;

public class Palindrome {
      
    public static void main (String args[]){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();
        sc.close();

        if (isPalindrome(palindrome)){

            System.out.println("Number :" + palindrome + " is a palindrome ");
        }else
         System.out.println("Number :" + palindrome + " is not a palindrome ");

    }
    public static boolean isPalindrome(int number){
        int originalNumber = number;
        int reverse =0;

        while (number !=0){

            int remainder = number % 10;
            reverse =reverse *10 + remainder;
            number = number /10;
        }
        if (reverse == originalNumber ){
            return true;
        
        }
        return false;
    }
  
}
