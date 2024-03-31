package Practice;
//import java.util.*;

public class P_string {
    public static void main(String[] args) {
        //String name1;
        // Declaration
        // String name ="sudhabsh";
        // System.out.println(name);
        // System.out.println(name.length());

        //Taking Input 
        // Scanner sc= new Scanner(System.in);

        // System.out.println("Enter the name: ");
        // name1 = sc.nextLine();
        // sc.close();
        // System.out.println(name1);

       // Access characters of a string
       String firstName = "Tony";
       String secondName = "Stark";


       String fullName = firstName + " " + secondName;


       for(int i=0; i<fullName.length(); i++) {
           System.out.print(fullName.charAt(i));
       }


    }
}
