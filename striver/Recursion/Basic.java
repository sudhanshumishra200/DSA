package striver.Recursion;

public class Basic {
    public static void main(String [] args){
        print();
    }
     static int count =0;
    public static void print(){
        if (count ==3){
            return;
        }
        System.out.println(count);
        count ++;
        print();
    
    }
}
