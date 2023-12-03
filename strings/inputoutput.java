import java.util.*;

public class inputoutput {

    public static void printchar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        // String str = "abcd";
        // String str2 = new String("xyz");
        //
        // Scanner sc = new Scanner(System.in);
        // String name;
        //
        // name = sc.nextLine();
        // System.out.print(name);

        String fullname = "Tony stark";
        // System.out.print(fullname.length()); // space will also count
        // concataenation

        String lastname = "Mishra";
        String Yourname = fullname + " " + lastname;
        // System.out.print(Yourname);
        printchar(Yourname);

    }

}
