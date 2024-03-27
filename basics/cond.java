// simple java question where we have to use the if else conditions 
import java.util.*;
public class cond {
     public static void main(String[] args) {

        //int a = 10;
        //int b =5;
        //if (a>b){
        //    System.out.println("A is largest number");
        //}else{
        //    System.out.println("B is largest number ");
        //} 

        // income tax calculator
        System.out.println("Enter your income");
        Scanner sc = new Scanner(System.in);
        int income =sc.nextInt();
        int tax;   // java default store zero

        if (income <500000){
            tax = 0;
        }else if (income> 500000 && income <1000000) {
            tax = (int) (income*0.2);
        
        }else {
            tax = (int) (income *0.3);
        }
        System.out.println("your tax is " + tax);
        sc.close();
     

    }
}