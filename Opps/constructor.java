public class constructor {
    public static void main(String args[]) {
        Student s1 = new Student("sudhanshu");
        System.out.println(s1.name);
        //Student s2 = new Student();
        // Student s2 = new Student("sudhanshu");

    }

}

class Student {

    String name;
    int roll;
    // constructors

    Student() { // nonparamitereized constructor
        System.out.println("Initialization of constructor..");

    }

    Student(String name) { // Parameterized constrs.
        this.name = name;

    }

}
