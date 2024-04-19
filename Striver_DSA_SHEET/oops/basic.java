package Striver_DSA_SHEET.oops;

public class basic {
    public static void main(String[] args){
        // making the object from the class
        Student s1= new Student();
        s1.name="sudhanshu";
        s1.age= 23;
        s1.write();

        //second object 
        Student s2= new Student ();
        s2.name ="Aditya";
        s2.age= 22;
        s2.write();
        
    }
}

class Student{
    // properties
    String name;
    int age;

    //method
    public void write(){
        System.out.println("The name of the the student is: "+ this.name);
        System.out.println("age is :"+ this.age); // this keyword is used to identify which object is being  called
    }

}
