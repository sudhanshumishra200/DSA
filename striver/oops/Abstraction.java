package striver.oops;

//1) Abstract class
//2) Interfaces
//we cannot create an obj or instance of Abstract class
public class Abstraction {
    public static void main(String[] args) {
        //obj
        // Horse h1= new Horse();
        // h1.walk();

        // Chicken c1= new Chicken();
        // c1.walk();
        // System.out.println(c1.color);

        Mustang myHorse =new Mustang();
    }
}

abstract class Animal{
    //constr
    String color;
    Animal(){
    System.out.println("Animal constr called");
}
    void eat(){
        System.out.println("All Animal's eat ");
    }

    abstract void walk();
}

class  Horse extends Animal{
    Horse(){ //constr
        // color= "brown";
        System.out.println("Hosre constr called");
    }
    void walk(){
        System.out.println("Horse walks on 4 legs ");
    }
}

// class Chicken extends Animal {
//     void changeColor (){ // constr
//         color ="dark brown";
//     }
//     void walk(){
//         System.out.println("Chicken walks on 2 legs");
//     }
// }

class Mustang extends Horse{
    Mustang(){
        System.out.println("mustang constr called ");
    }
}