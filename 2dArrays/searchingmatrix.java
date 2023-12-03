public class searchingmatrix {
    // T.c == o(n+m)

    public static boolean staircase_search(int matrix[][], int key) {

        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.print("The key value is found at :" + "(" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {// left
                col--;
            } else {
                row++;
            }
        }
        System.out.print("Key is not found ! :");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16, } };
        int key = 100;
        staircase_search(matrix, key);
    }
}