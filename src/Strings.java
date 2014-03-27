/**
 * Created by catrapture on 27/03/2014.
 */
public class Strings {

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
}
