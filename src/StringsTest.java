import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by catrapture on 27/03/2014.
 */
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
}
