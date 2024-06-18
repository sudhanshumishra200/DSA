package Striver_DSA_SHEET.Recursion;
// print the user name 
public class print_Name {

    public static void Print_names(int n){
        if (n<=0 ){
            return;
        }
        System.out.println("Sudhanshu");
        Print_names(n-1);

        
    }
    public static void main(String [] args){
        Print_names(5);
    }
}
