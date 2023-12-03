public class stringbuilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder(" ");
        for (char ch = 'A'; ch < 'Z'; ch++) {
            sb.append(ch);
        }
        // o(n^2)
        System.out.println(sb);

    }
}
