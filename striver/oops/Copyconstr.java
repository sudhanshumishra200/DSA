package striver.oops;
//not been asked in interview
public class Copyconstr {
public static void main(String[] args) {
    //obj
    Student2 s1= new Student2();
    s1.name= "sudhanshu";
    s1.roll= 1234;
    s1.password ="Nobody";

    s1.marks[0]=100;
    s1.marks[1]=40;
    s1.marks[2]=30;
   
    Student2 s2 =new Student2(s1);
    s2.password= "MishraJi";
    s1.marks[2]=100; //the problem statement
    //deep copy -> changes dont reflect
    //shallow copy -> changes reflect

    for (int i=0; i<3; i++){
        System.out.println(s2.marks[i]);
    }
    
    
}
}

class Student2{
    String name;
    int roll;
    String password;
    int marks[];

    // shallow copy constructor
    // Student2(Student2 s1){
    //     this.name =s1.name;
    //     this.roll =s1.roll;
    //     this.marks =s1.marks;
    // }

    //deep copy constructor
    Student2(Student2 s1){
        marks =new int[3];
        this.name= s1.name;
        this.roll =s1.roll;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }

    Student2(){
        marks =new int[3];
        System.out.println("this is the first obj constr");
    }



}
