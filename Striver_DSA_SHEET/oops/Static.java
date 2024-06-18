package Striver_DSA_SHEET.oops;


//Static keyword in java is used to share the same variable or method of a given class
//Properties
//Function
//Blocks
//Nested Classes

public class Static {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.schoolName = "GKPV";

        Student s2= new Student();
        System.out.println(s2.schoolName);
    }
}
 
class Student{
    String name;
    int roll;

    static String schoolName;

    void setName(String name ){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
