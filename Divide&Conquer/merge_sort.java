//Merge sort problem using Divide and Conquer rule
// time complexity is good O(nlogn)
// space complexity is not good O(n)
public class merge_sort {

    public static void Print_Arr(int arr[]) { // To print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        // kaam
        int mid = si + (ei - si) / 2; // mid =(si+ei)/2
        mergeSort(arr, si, mid); // For left part
        mergeSort(arr, mid + 1, ei);// For right part
        // Now merge the boath sorted array
        merge(arr, si, mid, ei);
    }

    // merge method to merge sorted part
    public static void merge(int arr[], int si, int mid, int ei) {
        // Take a temperary array
        int temp[] = new int[ei - si + 1];
        int i = si;// iterator for left part
        int j = mid + 1;// iterator for right side
        int k = 0;// iterator for temp

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // for leftover elements of 1st sorted part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // for leftover elements of 2st sorted part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];

        }

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8, -2, 0 };
        mergeSort(arr, 0, arr.length - 1);
        Print_Arr(arr);
    }
}