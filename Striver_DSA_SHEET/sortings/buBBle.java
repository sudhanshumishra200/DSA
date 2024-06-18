package Striver_DSA_SHEET.sortings;

public class buBBle {
    public static void bubble_sort(int arr[]){
        int n= arr.length;

        for (int i=0; i<n-2; i++){
            for (int j=0; j<n-1-i; j++){
                //swap
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void printarr(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,24,53,6,64,98,35,0,45,78,45,35};
        bubble_sort(arr);
        printarr(arr);
    }
}
