package Practice;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        int day;
        System.out.println("Enter the number of day: ");
        Scanner sc= new Scanner(System.in);

        day= sc.nextInt();
        

        switch (day){
            case 1:{
                System.out.println("Today is monday : ");
                break;
            }
            case 2:{
                System.out.println("Today is Tuesday : ");
                break;
            }
            case 3:{
                System.out.println("Today is wednesday : ");
                break;
            }
            case 4:{
                System.out.println("Today is Thrusday : ");
                break;
            }
            case 5:{
                System.out.println("Today is Friday : ");
                break;
            }
            case 6:{
                System.out.println("Today is Saturday : ");
                break;
            }
            case 7:{
                System.out.println("Today is Sunday : ");
                break;
            }
            default:{
                System.out.println("Invalid");
            }
        }
        sc.close();

    }
}
