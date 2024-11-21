package striver.oops;

public class MultipleInher {
    public static void main(String[] args) {
        //obj
        Beer B1 =new Beer();
        B1.eats();
        B1.legs();
        B1.name ="Beer";
        B1.description="This is a beautiful animal and it is a Harbivore animal";

        System.out.println(B1.name);
        System.out.println(B1.description);
    }
}

// MultiINheritance 

interface Harbivore{
    void eats();
}

interface Carnivore{
void legs();
}
//multiple Inheritance
class Beer implements Harbivore , Carnivore {
   
    String name;
    String description;

    public void eats(){
        System.out.println("Beer eats grasses :");
    }
    public void legs(){
        System.out.println("Beer has 4 legs :");
    }
}
