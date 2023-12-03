public class hierachicalInher {
    public static void main(String args[]) {

        Birds b1 = new Birds();
        b1.eat();

    }

}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breaths");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}

class Birds extends Animal {
    void fly() {
        System.out.println("flys");
    }
}