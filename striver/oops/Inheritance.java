package striver.oops;

public class Inheritance {
    public static void main(String[] args) {
        Fish Shark = new Fish();
        Shark.eat();
        Shark.fins= 2;
        System.out.println(Shark.fins);
    }
}
// single lavel Inheritance
//multi level inhe
//herarical inhe
//hybrid inhe
//Animal class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breath");
    }
}

//Drived class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swim in water");
    }
}