import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


public class StringsTest {

    @Test
    public void hasUnique() {
        assertTrue(Strings.hasUnique("cat"));
    }

    @Test
    public void doesNotHaveUnique() {
        assertFalse(Strings.hasUnique("cca"));
    }

    @Test
    public void isPermutation() {
        assertTrue(Strings.isPermutation("cat", "tac"));
    }

    @Test
    public void isNotPermutation() {
        assertFalse(Strings.isPermutation("caf", "tac"));
    }

    @Test
    public void shouldBeMax3() {
        char[] c = new char[]{'R', 'G', 'B', 'B', 'G', 'R', 'Y', 'Y'};
        int couples = Strings.maxCouples(c);
        System.out.println(couples);
    }

    @Test
    public void shouldRemoveDups() {
        String reuslt = Strings.removeDuplicates("fluffy");
        System.out.println(reuslt);
    }

    @Test
    public void shouldFindNumParisAddToK() {
        int[] ints = new int[]{1, 4, 3, 2, 1, 6, 7, 8, 9};
        int reuslt = Strings.countPairsAddToK(ints, 9);
        System.out.println(reuslt);
    }

    @Test
    public void shouldRemoveDuplicateInts() {
        int[] ints = new int[]{1, 4, 3, 9, 2, 1, 6, 7, 8, 9};
        int[] result = Strings.removeDuplicatesFromIntArray(ints);
        System.out.println(Arrays.toString(result));
    }


}
