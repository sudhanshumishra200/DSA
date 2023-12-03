public class first {
    public static void main(String args[]) {
        Pen p1 = new Pen(); // we have created a pen object call p1
        p1.setColor("green");
        // p1.name ="shradha"
        System.out.println(p1.getcolor());
        // p1.setTip(5);
        p1.setTip(7);
        System.out.println(p1.gettip());

        // creating a bankacount object
        Banckacount myac = new Banckacount();
        myac.username = "sudhanshumishra";
        // myac.password = "sudhanshu@123";
        myac.setPassword("mamaji");
        System.out.println(myac.getpassword());

    }

}

class Banckacount {
    public String username;
    private String password;

    String getpassword() { // get is used to return the value
        return this.password;
    }

    public void setPassword(String pwd) { // set is used to modify the value
        password = pwd;
        // to print the new password
    }

}

class Pen {
    // property + function
    private String color;
    private int tip;

    String getcolor() {
        return this.color;
    }

    int gettip() {
        return this.tip;
    }

    void setColor(String newColor) {
        color = newColor;

    }

    void setTip(int newTip) {
        tip = newTip;

    }

}

class student {
    String name;
    int age;
    float percentage;

    void calPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;

    }

}