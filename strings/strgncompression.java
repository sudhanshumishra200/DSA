public class strgncompression {

    // public static String compress(String str) {
    // // time compl --O(n) because in both loop same of i incremeant
    // String newstr = "";
    // for (int i = 0; i < str.length(); i++) {
    // Integer count = 1;
    // while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
    // count++;
    // i++;
    // }
    // newstr += str.charAt(i);
    // if (count > 1) {
    // newstr += count.toString();
    // }
    // }
    // return newstr;
    // }

    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");
        int n = str.length();

        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count == 1) {
                sb.append(str.charAt(i));
            } else if (count > 1) {
                sb.append(str.charAt(i) + "" + count);
            }
        }
        return sb.toString();

    }

    public static void main(String args[]) {
        String str = "abbccd";
        System.out.println(compress(str));

    }
}
