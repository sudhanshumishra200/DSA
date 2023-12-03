
public class string {
    public static void main(String args[]) {
        char arr[] = { 'a', 'b', 'c', 'd' };// char array
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");

            System.out.println();

        }
        String str = "abcd";
        String str2 = new String("xyz");
        System.out.println(str);
        System.out.println(str2);

        // Strings are IMMUTABLE
    }

}
