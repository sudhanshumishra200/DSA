package striver.sortings;

public class selections {
    public static void selecSort(int arr[]){
        //outer loop
        int n= arr.length;
        for (int i=0; i<n-1; i++){
            //inner loop
            int min =i;
            for (int j=i; j<n; j++){
                if(arr[j]< arr[min]){
                    min=j;
                }
                //swap
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public void Printarr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public  void main(String[] args){
        int arr[] = {23,56,23,34,12,8,76,56,8,0};
        selecSort(arr);
        Printarr(arr);
    }
}
