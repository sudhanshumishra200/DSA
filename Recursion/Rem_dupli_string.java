// To Remove Duplicates in Strings
//Asked in Google and Microsoft
public class Rem_dupli_string {
    // we will take total four variable String str, int idx, StringBuilder newstr
    // and boolean map.

    public static void RemoveDuplicates(String str, int idx, StringBuilder newstr, boolean map[]) {
        // base case
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }

        // work
        char currchar = str.charAt(idx);

        if (map[currchar - 'a'] == true) {
            // Dduplicaates
            RemoveDuplicates(str, idx + 1, newstr, map);
        } else {
            map[currchar - 'a'] = true;
            RemoveDuplicates(str, idx + 1, newstr.append(currchar), map);

        }
    }

    public static void main(String args[]) {
        String str = "sudhanshumishra";
        RemoveDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

    }

}
