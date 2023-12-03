import java.util.*;
public class avgofthree {
    public static void avg(double a ,double b ,double c){
        double avg = (a+b+c)/3;
        System.out.println("The avg of "+ a + b + c +" is =" + avg );

    }
    public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double x =sc.nextDouble();

        System.out.println("Enter the second number: ");
        double y =sc.nextDouble();

        System.out.println("Enter the third number: ");
        double z =sc.nextDouble();
        
        avg( x,y,z);
    }
}
