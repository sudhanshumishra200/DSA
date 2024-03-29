package Practice;
// substring
public class Sub_String {
    public static void main(String[] args) {
        String sentance = "My name is Tony";
        String name = sentance.substring(11, sentance.length());
        System.out.println(name);

        //Strings are Immutable

        // ParseInt Method of Integer class
        String str ="123";
        int number =Integer.parseInt(str);
        System.out.println(number);

        //ToString method of string class

        int number2 =134;
        String str2 =Integer.toString(number2);
        System.out.println(str2);

        
    }


}
