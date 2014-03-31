import org.junit.Test;

import java.util.Arrays;

/**
 * Created by catrapture on 30/03/2014.
 */
public class HotPotatoTest {

    @Test
    public void testPotato() {
        String result = HotPotato.hotPotato(Arrays.asList("Bill", "David", "Susan", "Jane", "Kent", "Brad"), 7);
        System.out.println("result " + result);
    }
}
