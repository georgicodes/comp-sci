/**
 * Created by catrapture on 27/03/2014.
 */
public class Strings {

    // Time O(n)
    // Space O(1)
    public static boolean hasUnique(String s) {
        int[] ascii = new int[256];
        char[] letters = s.toCharArray();

        for (char c : letters) {
            int count =  ascii[c] + 1;
            if (count > 1)
                return false;
            ascii[c] = count;
        }

        return true;
    }

    // Time O(n)
    // Space O(1)
    public static boolean isPermutation(String a, String b) {
        if (a == null || b == null)
            throw new UnsupportedOperationException();

        if (a.length() != b.length())
            return false;

        int[] ascii = new int[256];
        for (char c : a.toCharArray()) {
            ascii[c]++;
        }

        for (char c : b.toCharArray()) {
            int count = ascii[c];
            count = count -1;
            if (count < 0)
                return false;
        }
        return true;
    }
}
