package Practice;

public class String_Basic {
    public static void main (String[] args){
        String name1 ="Tony";
        // System.out.println(name);
        // System.out.println(name.length());

        //Comparision
        String name2 ="Tony";

        if(name1.compareTo(name2) ==0){
            System.out.println("The both strings are same: ");
        }
        else{
            System.out.println("The both strings are different"); 
        }
         
          //Gives correct answer here
        if(name1 == name2) {
        System.out.println("They are the same string");
        } else {
        System.out.println("They are different strings");
        }

 
        if(new String("Tony")== new String("Tony")){  //we should't use the equality operator in string the reason why 
        // both are not equal because their presentation in memory is different
        
            System.out.println("The both strings are same: ");
        }else{
            System.out.println("The both strings are different");
        }


    }
}
