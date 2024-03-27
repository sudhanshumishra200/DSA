import java.util.*;
public class input{
    public static void main(String args[]){
        int marks[]=new int [100]; 
        //System.out.print("Length of array "+ marks.length);// we use this function for length

        Scanner sc =new Scanner(System.in);
        //int phy =sc.nextInt();

        System.out.print("Enter the phy number :");
        marks[0]= sc.nextInt();//phy 

        System.out.print("Enter the chem number :");
        marks[1] = sc.nextInt();//chem

        System.out.print("Enter the math number :");
        marks[2] = sc.nextInt();//math
        sc.close();

        System.out.println("phy " + marks[0]);
        System.out.println("chem " + marks[1]);
        System.out.println("math " + marks[2]);

        marks[2]= 100;

        System.out.print("math " + marks[2]);
        
    }


}
