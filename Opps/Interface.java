public class Interface {
    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();

    }

}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, right, left and diagonal");
    }
}

class Rooks implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, right and left");
    }
}