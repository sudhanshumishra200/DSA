public class MultipleInher {
    public static void main(String args[]) {
        Beer b = new Beer();
        b.vegitarian();
        b.nonvegitarian();

    }

}

interface Harvibore {
    void vegitarian();

}

interface Carnibore {
    void nonvegitarian();

}

class Beer implements Harvibore, Carnibore {
    public void vegitarian() { // we have to write a public because by default veegitarian in ininterface is
                               // public by its interface property.
        System.out.println("beer is a vegitarian ");
    }

    public void nonvegitarian() {
        System.out.println("beer is also a non-vegitarian ");

    }

}
