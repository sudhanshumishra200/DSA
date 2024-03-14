package Searching;
// Linear search Time comlexcity =O(n)
public class Linear_Search {

    public static int linearSearch(int numbers[], int key){
        for (int i=0; i<numbers.length; i++){
            if (numbers[i]== key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] ={22,33,44,55,66,77};
        int key =44;

        int index =linearSearch(arr, key);

        if (index==-1) {
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index " + index);
        }

    }
    
}
