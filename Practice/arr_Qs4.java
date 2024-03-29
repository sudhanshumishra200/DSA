package Practice;
//Keep all -ve elements in the array one side

public class arr_Qs4 {
    public static void main(String[] args) {
        int temp;
        int arr[]= {-1, 2, -3, 4, -5, 6};

        for (int i=0; i<arr.length-1; i++){ // for checking element
           for(int j=0; j<arr.length-i-1; j++){
            if(arr[j] <=0 ){ //arr[j+1]>0
                temp= arr[j];
                arr[j]= arr[j+1];
                arr[j+1]=temp;
            }

           }
        }

        //print arrray
        for (int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
        }
    }
}
