public class reverse {
    
    public static void reverse_Array(int numbers[]){
        int first =0, last =numbers.length -1;

        while(first < last ){
            //swap
            int temp = numbers[first];
            numbers[first] =numbers[last];
            numbers[last]= temp;

            first ++;
            last --;

        }
    }
    public static void main(String args[]){
        int numbers[]= {1,3,4,5,6,7};

        // print before reverse

        for (int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

        reverse_Array(numbers);
        //print array

        for (int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }

        System.out.println();
    }
}
