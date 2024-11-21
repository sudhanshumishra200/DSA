package striver.STRINGS_;
public class basic {

// reverse a string 
    public static void main(String args[] ){
        StringBuilder str = new StringBuilder("Saurav");
        //System.out.println(str.reverse());

        int n= str.length();
        char frontChar;
        char endChar;

        for (int i=0; i<=n/2; i++){


            frontChar = str.charAt(i);
            endChar = str.charAt(n-1-i);

            str.setCharAt(i, endChar);
            str.setCharAt(n-1-i, frontChar);

        }
        System.out.println(str);

    }
    
}
