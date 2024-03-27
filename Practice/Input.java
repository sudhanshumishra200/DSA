package Practice;

import java.util.Scanner;

public class Input {
    public static void main(String[] args){

        int x,y;
        Scanner sc = new Scanner(System.in);// input Scanner class

        System.out.print("Enter the first Number: ");
        x = sc.nextInt();

        System.out.print("Enter the second Number: ");
        y= sc.nextInt();
        sc.close();

        System.out.println("The numbers are as " + x +"and" + y);
    }
}
