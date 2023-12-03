public class aray_as_function {



    public static void update(int marks[], int nonchangable){
        nonchangable =10;
        for (int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[]){
        int marks[] = {99, 98, 97, 90};// it is call by referance thats why it change // array pass by referance 
        int nonchangable =5;  // call by value thats why it does not change 
        update(marks, nonchangable);
        System.out.println(nonchangable +"");

        //to prints our marks 
        for (int i=0; i<marks.length; i++){
            System.out.print(marks[i]+ " ");
        }
        System.out.println();

    }
    
}
