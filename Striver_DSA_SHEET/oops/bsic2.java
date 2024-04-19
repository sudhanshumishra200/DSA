package Striver_DSA_SHEET.oops;
public class bsic2 {
    // cunstrctor 
    public static void main(String [] args){
        //creating the object 
        Student1 s1 =new Student1();// this Student() is a cunstructor 

        s1.name ="Sudhanshu Mishra";
        s1.age =21;
        s1.year =4;

        
        //second object 

        Student1 s2= new Student1();
        s2.name ="vaibhav";
        s2.age =21;
        s2.year =4;
    

    }
}

class Student1 {
    String name ;
    int age;
    int year;

    //cunstructor 
    Student1 (){
        System.out.println("This is cunstructor: ");
    }
}
