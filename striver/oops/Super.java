package striver.oops;
// supar keyword is used to refer immediate parent class object.
//- to access parent prop
//- to access parent fun
//- to access parent constructor
// not too much important


public class Super { 
    public static void main(String[] args) {
        //obj
        Horse H1= new Horse();

    }
}

class Animal{
    Animal(){
        System.out.println("Animal constructor");
    }
}

class Horse extends Animal{
    Horse(){
        super();
        System.out.println("Horse constructor");
    }
}