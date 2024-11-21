package striver.ARRAY;
// Sexond largest in the array
public class arr2 {
    
    public static void main(String[] args) {
        int arr[] = { 2,333,5,666,70,9};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i=0; i < arr.length; i++){
            if (arr[i] > max){
                secondMax = max;
                max = arr[i];

            } else if ( arr[i]> secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        System.out.println("Second largest element in the array is: " + secondMax);

    }
}
