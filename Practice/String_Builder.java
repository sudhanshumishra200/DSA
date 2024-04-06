package Practice;

public class String_Builder {
public static void main(String[] args){
    // String str ="h";
    StringBuilder sb= new StringBuilder("Tonny");
    System.out.println(sb);

    //char at index 0 get
     char i=sb.charAt(0);
    System.out.println(i);

    //set char at index 0

    sb.setCharAt(0,'P');
    System.out.println(sb);

    //insert 
    sb.insert(0,'S');
    System.out.println(sb);

    //delete y
    sb.delete(4,5);
    System.out.println(sb);

    // apend 
    sb.append("T");
    System.out.println(sb);

}

      
}
