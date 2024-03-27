import java.util.Scanner;

public class input {

    public static void main (String[] args){
        int x;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        x = sc.nextInt();
        System.out.println("The number is : "+ x);
        sc.close();   // we have to close the the scanner
    }
    
       

       

}