package striver.oops;
// Multiple forms
//Method overloading(compile time)
public class Polymorphism {
    public static void main(String[] args) {
        //obj
        calculator c1 =new calculator();
        System.out.println(c1.sum(1,2));
        System.out.println(c1.sum((float)2.3, (float)4.5));
        System.out.println(c1.sum(1,2,3));
        
    }
}


class calculator{
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}