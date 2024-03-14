package Searching;
// time complexity = O(log n)
public class Binary_Search {
    public static int BinarySearch(int arr[], int key){
        int start =0; 
        int end = arr.length -1;

        while (start <= end ){
            // find mid value
            int mid = (start +end )/2;
            if (arr[mid]==key){
                return mid;
            }
            // for left part
            else if (arr[mid] >key ){
                end =mid-1;
            }
            // for right part
            else {
                start = mid +1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //the array should be sorted
        int arr[]={1,2,3,4,5};
        int  key =2;
        System.out.println("The search found at index: "+ BinarySearch(arr,key));

    }
}
