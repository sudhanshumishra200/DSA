package striver.oops;
//Interface is the blue print of classes
//It is used to impliment multiple Inheritance (5th type of Inheritance)
// in java we cant impliment the multiple inheritance through classes so we use INTERFACES
// we use Interface to achieve total abstraction


//All methods are public , abstract and without implementations
//used to achieve total abstraction
// variable in the interface are final, public and static


public class Interfaces {
public static void main(String[] args) {
    Queen q1= new Queen();
    q1.moves();
}
}


interface chessPlayer{
    void moves();
}

class Queen{
    public void moves(){
        System.out.println("up, down, left, right, diagonal (in all direction)");
    }
}

class Rook{
    public void moves(){
        System.out.println("up, down, left and right (in all direction)");
    }
}

