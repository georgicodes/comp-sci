import java.util.Arrays;

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
            int count = ascii[c] + 1;
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
            count = count - 1;
            if (count < 0)
                return false;
        }
        return true;
    }

    public static int maxCouples(char[] c) {
        int max = 0;
        int end = c.length;
        int l = 0;
        int r = 1;

        while (l >= 0 && r < end) {
            if (c[l] == c[r]) {
                max++;
                if (l - 1 >= 0) {
                    l--;
                    r++;
                } else {
                    l = r;
                    r++;
                }
            } else {
                l++;
                r++;
            }
        }
        return max;
    }

    // Time O(n)
    // Space O(n)
    public static String removeDuplicates(String s) {
        boolean[] ascii = new boolean[256];
        int count = 0;
        char chars[] = s.toCharArray();

        for (char c : chars) {
            if (ascii[c]) {
                count++;
            }
            ascii[c] = true;
        }

        int idx = 0;
        char[] result = new char[s.length() - count];

        for (char c : chars) {
            if (ascii[c]) {
                result[idx] = c;
                idx++;
                ascii[c] = false;
            }
        }

        return new String(result);
    }

    public static void printFib(int a, int b, int count) {
        if (count == 0)
            return;

        System.out.println(a);
        printFib(b, a + b, --count);
    }

    public static int countPairsAddToK(int[] ints, int k) {
        int start = 0;
        int end = ints.length -1;
        int count = 0;

        Arrays.sort(ints);

        while (start < end) {
            int sum = ints[start] + ints[end];

            if (sum == k) {
                count++;
                start++;
                end--;
            } else if (sum > k) {
                end--;
            } else {
                start++;
            }
        }

        return count;
    }

}
