package striver.STRINGS_;
public class reverse {
    

    public static void main(String args []){


        // StringBuilder sb = new StringBuilder("sudhanshu");

        // char frontChar;
        // char endChar;
        // int n= sb.length();

        // // loop
        // for (int i=0; i<n/2; i++){

        //      frontChar =sb.charAt(i);
        //      endChar =sb.charAt(n-1-i);

        //      sb.setCharAt(i, endChar);
        //      sb.setCharAt(n-1-i, frontChar);

        // }
        // System.out.println(sb);

        String str ="Sudhanshu";
        String str2 ="";


        //loop
        for (int i=str.length()-1; i>=0; i--){
            str2 = str2+ str.charAt(i);
        }

        System.out.println(str2);
    }
}
