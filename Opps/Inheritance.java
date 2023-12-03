public class Inheritance {
    public static void main(String args[]) {

        Fish shark = new Fish();
        shark.eat();
        shark.child = 4;
        System.out.println(shark.child);

    }

}

// example of multilevel inheritance and single inheritance
// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breaths");
    }
}

// Drived class
class Mammal extends Animal {
    int child;
}

// Drived class

class Fish extends Mammal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}