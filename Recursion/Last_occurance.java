// Problem -8: WAP to find the last occurance of an element in an array
//Time complexcity = O(n)
// Space complexcity = O(n)
public class Last_occurance {

    public static int Lastoccurance(int arr[], int i, int key) {
        if (i == arr.length) { // Base case
            return -1;
        }
        // Approach First we look forward
        int isFound = Lastoccurance(arr, i + 1, key);

        // Then we compare with self
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 5, 8, 9 };
        int i = 0;
        int key = 5;
        System.out.println(Lastoccurance(arr, i, key));

    }
}
