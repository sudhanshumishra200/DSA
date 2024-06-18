//package sorting;

public class selection {
    public static void selection_sort(int arr[]){
        //outrer loop 
        for(int i=0; i<arr.length-1; i++){
            int minpos=i;
            //for finding the minimum element 
            for (int j=i+1; j<arr.length; j++){
                if (arr[minpos] > arr[j]){
                    minpos =j;
                }
            }//swap
            int temp =arr[minpos];
            arr[minpos]= arr[i];
            arr[i]=temp;
        } 

    }

    public static void printarr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main (String args[]){
        int arr[] ={23,434,54,6,46};
        selection_sort(arr);
        printarr(arr);
    }
}
