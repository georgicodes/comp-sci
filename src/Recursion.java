/**
 * Created by catrapture on 30/03/2014.
 */
public class Recursion {

    public static void printFib(int a, int b, int count) {
        if (count == 0)
            return;

        System.out.println(a);
        printFib(b, a + b, --count);
    }

    public static int sumList(int[] list, int index) {
        if (list.length == index)
            return 0;

        return list[index] + sumList(list, index+1);
    }

    public static String convertToString(int num, int rem, String s) {
        char[] digits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        if (num == 0) {
            s = digits[rem] + s;
            return s;
        } else if (rem <= 9 && rem > 0)
            s = digits[rem] + s;

        return convertToString(num / 10, num % 10, s);
    }

    public static String reverse(String s) {
        if (s.length() == 0)
            return s;
        int lastIdx = s.length() - 1;
        return s.substring(lastIdx) + reverse(s.substring(0, lastIdx));
    }

    public static boolean isPalindrome(String s) {
       if (s == null)
           return false;
        if (s.length() == 0 || s.length() == 1)
            return true;

        int last = s.length() -1;
        if (s.charAt(0) == s.charAt(last)) {
            return isPalindrome(s.substring(1, last));
        }

        return false;
    }
}
