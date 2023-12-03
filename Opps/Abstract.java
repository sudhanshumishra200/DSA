public class Abstract {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Mustang m = new Mustang();

        // System.out.println(h.color); // first animal constroctur will be called

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        // we cannot creat object of an abstract class
        // Animal a =new Animal(); false
    }

}

abstract class Animal {
    String color;

    Animal() { // constructor
        System.out.println("Animal constructor called");
        ;
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk(); // there is no implementation it just give the idea this method does't dpends
                          // upon walk()
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");

    }

    void changeCOlor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("walks on 4 legs");

    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal {
    void changeCOlor() {
        color = "white";
    }

    void walk() {
        System.out.println("walks on 2 legs");

    }
}