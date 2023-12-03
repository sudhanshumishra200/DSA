public class MethodOverloading {
    public static void main(String args[]) {
        // object creation
        Calculator cal = new Calculator();
        System.out.println(cal.Sum(2, 3));
        System.out.println(cal.Sum((float) 2.5, (float) 3.5));
        System.out.println(cal.Sum(2, 3, 5));

    }

}

// Method overloading (compile time polymorphism)
class Calculator {
    int Sum(int a, int b) {
        return a + b;
    }

    float Sum(float a, float b) {
        return a + b;

    }

    int Sum(int a, int b, int c) {
        return a + b + c;

    }
}
