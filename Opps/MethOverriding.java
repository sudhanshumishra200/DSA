public class MethOverriding {
    public static void main(String args[]) {
        // object creation
        Deer d = new Deer();
        d.eat(); // child class function will be called
    }

}

class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");

    }
}