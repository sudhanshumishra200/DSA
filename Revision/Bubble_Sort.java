package Revision;

public class Bubble_Sort {
    public static void Bubble_sort(int arr[]){
        //outer loop i=n to n-1
        for (int i=0; i<arr.length-1; i++) {
            //inner loop :- j= 0 to j= n-1-i
            for (int j=0; j<arr.length-1-i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    

    public static void printarr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]= {5,4,1,3,2};
        Bubble_sort(arr);
        printarr(arr);
    }
}
