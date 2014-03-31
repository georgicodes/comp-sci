import org.junit.Test;

/**
 * Created by catrapture on 30/03/2014.
 */
public class RecursionTest {

    @Test
    public void shouldPrintFib() {
        Recursion.printFib(0, 1, 10);
    }

    @Test
    public void shouldSum() {
        int[] ints = new int[]{1, 2, 3};
        int result = Recursion.sumList(ints, 0);
        System.out.println("result: " + result);
    }

    @Test
    public void shouldConvertToString() {
        String result = Recursion.convertToString(789, 0, "");
        System.out.println("result: " + result);
    }

    @Test
    public void shouldReverse() {
        String result = Recursion.reverse("cat");
        System.out.println("result: " + result);
    }

    @Test
    public void isPalindrome() {
        boolean result = Recursion.isPalindrome("radar");
        System.out.println("result: " + result);
    }
}
