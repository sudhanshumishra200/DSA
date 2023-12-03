//package sorting;

public class bubblesort {
    //package Sorting;

    public static void bubble_sort(int arr[]){
        int n=arr.length;
        //loop for no of turns
        for (int i=0; i<n-1; i++){
            for (int j=0 ; j<n-1-i; j++){
                if (arr[j]> arr[j+1]){
                    //swap
                    int temp =arr[j];
                    arr[j]=arr[j+1];
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

    public static void main (String args[]){
        int arr[] ={5, 4, 1, 3, 2};
        bubble_sort(arr);
        printarr(arr);
    }
    


    
}
