//  Problem -7: WAP to find the first occurance of an element in an array
// Time complexcity = O(n)
// Space complexcity = O(n)
class First_occurance {

    public static int Firstoccurance(int arr[], int i, int key) {

        if (i == arr.length) {// Base case
            return -1;
        }
        // Approach First we compare with self

        if (arr[i] == key) {
            return i;

        } // Then look forward
        return Firstoccurance(arr, i + 1, key);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 5, 8, 9 };
        int i = 0;
        int key = 5;
        System.out.println(Firstoccurance(arr, i, key));

    }

}