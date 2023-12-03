public class linear_search {
    
    // linear search 
    public static int linearSearch(int numbers[] , int key){
        for (int i=0; i<numbers.length; i++){
            if(numbers[i]== key)
            return i;
        }
        return -1;

    }
    public static void main(String args[]){
        int numbers[]= {11, 23, 45, 67, 80};
        String menu[] = {"dosa " }
        int key = 45;
        linearSearch(numbers, key);

        int index= linearSearch(numbers, key);

        if (index == -1){
            System.out.println("Key does not found ");
        }
        System.out.println("key found at position " + index );
    }
}
