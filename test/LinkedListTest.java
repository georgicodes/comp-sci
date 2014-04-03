import org.junit.Test;

/**
 * Created by catrapture on 3/04/2014.
 */
public class LinkedListTest {

    @Test
    public void shouldAddToList() {
        LinkedList list= new LinkedList();
        list.add(1);
        list.add(2);
        list.printList();
    }
}
