package Striver_DSA_SHEET.oops;

public class Methodover {
    public static void main(String[] args) {
        Deer s1 = new Deer();
        s1.eat();

        Animal1 a1= new Animal1();
        a1.eat();
    }
}


class Animal1 {
    void eat(){
        System.out.println("eats anythings");
    }
}

class Deer extends Animal1{
void eat(){
    System.out.println("eats grass only");
}
}