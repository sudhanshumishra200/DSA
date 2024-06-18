package Striver_DSA_SHEET.oops;
public class bsic2 {
    // cunstrctor 
    public static void main(String [] args){
        //creating the object 
        Student1 s1 =new Student1("sudhanshu");// this Student() is a cunstructor 

        // s1.name ="Sudhanshu Mishra";
        s1.age =21;
        s1.year =4;
        // System.out.println(s1.name);

        
        //second object 

        Student1 s2= new Student1("vishal");
        s2.name ="vaibhav";
        s2.age =21;
        s2.year =4;
        System.out.println(s2.name);
        
        //third obj.

        Student1 s3 =new Student1();
        Student1 s4 =new Student1(123);
        Student1 s5 = new Student1 ("priya");

        // s4.rollNo =134;
        // System.out.println(s4.rollNo);


    }
}

class Student1 {
    String name ;
    int rollNo;
    int age;
    int year;

    //cunstructor 
    //Types of constrctor
    // 1) non parameterized
    // 2)parameterized
    // 3)copy
    

    //constr. overloading in polymorphism
    Student1(){
        System.out.println("This is the first type of costrctr called non-para. :");
    }

    Student1 (String name){ //2)
        this.name =name;
        System.out.println(this.name);
    }
    Student1(int rollNo){
        this.rollNo =rollNo;
        System.out.println(this.rollNo);
    }

}
