package striver.oops;
//Encapsulation
public class accessmodifier {
    public static void main(String[] args) {
        //object 
        Banckacount Myacc =new Banckacount();
        Myacc.username ="lakdjlkfj";
        System.out.println(Myacc.username);
       // Myacc.password =sudhasnshu;// we cant write this because we cant access the private variable outside of the class

       Myacc.setpassword("sudhasnhu");


    }
}

class Banckacount{
    public String username;
    public String Fathersname;
    private String password;

    public void setpassword(String pwd){
        password =pwd;
    }
}