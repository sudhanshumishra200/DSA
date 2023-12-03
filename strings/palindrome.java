public class palindrome {
    public static boolean palindrome_check(String str) {
        int n = str.length();
        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == str.charAt(n - 1 - i)) {
                return true;
            } else {
                break;
            }
        }
        return false;

    }
    // Tc O(n)

    public static void main(String args[]) {
        String fullname = "sudhanhsu";
        System.out.print(palindrome_check(fullname));
    }

}
