//Quick sort 
//Approach 
// 1) Piviot - last element
// 2) Partition
// 3) To call quicksort (left)
//   To call quicksort (right)
/*TC (average case) = O(nlogn) TC(worst case) =O(n2)  Note : worst case occurs when pivot is always the smallest or the largest element*/

public class QuickSort {

    public static void Print_Arr(int arr[]) { // To print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // method for quickSort
    public static void quickSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        // last element. pidx is index of piviot value
        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx - 1);// for the left part
        quickSort(arr, pidx + 1, ei);// for the right part
    }

    // method for partition
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei]; // chose a pivot number
        int i = si - 1; // to make place for els smaller then pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        i++;
        // swap the pivot element in its place
        int temp = pivot;
        arr[ei] = arr[i];// we cant write pivot instead of arr[ei] because pivot is variable and
                         // arr[ei]is index
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5, -5 };
        quickSort(arr, 0, arr.length - 1);
        Print_Arr(arr);

    }

}
