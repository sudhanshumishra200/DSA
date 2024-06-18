package Striver_DSA_SHEET.sortings;

public class insertion {

    public static void insertion_sort(int arr[]){

        int n= arr.length;
        //outer loop
        for (int i=0; i< n-1; i++){
            //inner loop
            for (int j=i+1; j>0; j--){
                if (arr[j]< arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    public static void print_arr(int arr[]){
        for (int i=0; i< arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        }
        

    public static void main(String [] args){
        int arr[] ={3,4,5,6,2};
        insertion_sort(arr);
        print_arr(arr);
    }
}
