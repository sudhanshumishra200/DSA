//print an array [1,2,3,4,5] and then -2 from each value
// ie: [-1,0,1,2,3]
//TC O(n)
public class Backtracking_arr {

    public static void Print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void array(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            Print(arr);
            return;
        }
        // recursion
        arr[i] = val;
        array(arr, i + 1, val + 1); // fnx call
        arr[i] = arr[i] - 2; // backtracking
    }

    public static void main(String args[]) {
        int arr[] = new int[5];
        array(arr, 0, 1);
        Print(arr);

    }
}