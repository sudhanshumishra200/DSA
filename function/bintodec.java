public class bintodec {
    public static void binTodec(int binNum){
        int pow =0;
        int decNum =0;
        while (binNum >0){
            int lastdigit = binNum %10;
            decNum = decNum +(lastdigit * (int)Math.pow(2,pow));

            pow ++;
            binNum = binNum /10;

        }
        System.out.println("decimal of " + binNum +" = "+ decNum );
    }
    public static void main (String args[]){
        binTodec(101);
    }
    //public static void main(String args[]){
      //  System.out.println("Hi I am not able to find debug");
    //}
    
}
