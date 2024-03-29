package Practice;
//Reverse a String 
public class Stri_Qs2 {
    public static void main(String[] args) {
        // By just creating a new vacant string 
    //     String name = "abc";
    //     String new_name = "";

    //     for (int i=0; i<name.length(); i++){
    //         new_name =  name.charAt(i) +new_name;
    //     }
    // System.out.println(new_name);

        // by Converting String to character array:
    String name = "abc";
    char arr[] = name.toCharArray();  // built in Java String class method

    //scan the characters and print in opposite order

    for (int i=arr.length-1 ; i>=0 ; i--){
        System.out.print(arr[i]);
    }




    
}
}
