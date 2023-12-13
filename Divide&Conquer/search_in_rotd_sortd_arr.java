//Search in rotated Sorted Array
// PS-> input: Sorted, Roeated array with distinct numbers (in ascending order). It is rota. at a pivot point. Find the index of given element
// target =0: arr ={4,5,6,7,0,1,2}
// expected output  
public class search_in_rotd_sortd_arr {

    public static void Print_Arr(int arr[]) { // To print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // method for search
    public static int search(int arr[], int target, int si, int ei) {
        // base case
        if (si >= ei) {
            return -1;
        }
        // kaam
        int mid = si + (ei - si) / 2; // (si+ei)/2

        // case FOUND
        if (arr[mid] == target) {
            return mid;
        }

        // mid on L1
        if (arr[si] <= arr[mid]) {
            // case A:
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1); // inner recursion
            }
            // case B: mid right
            else {
                return search(arr, target, mid + 1, ei);
            }
        }

        // mid on L2
        else {
            // case C: L2 right
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            }
            // case D: mid left
            else {
                return search(arr, target, si, mid - 1);
            }

        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 9; // output --> 4
        int tarIdx = search(arr, target, 0, arr.length);
        System.out.println(tarIdx);

    }

}
