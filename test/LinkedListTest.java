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

    @Test
    public void shouldDetectCycle() {
        LinkedList list= new LinkedList();
        Node one = new Node(1, null);
        Node two = new Node(2, one);
        one.next = two;

        boolean b = list.hasCycle(one);
        System.out.println(b);
    }

    @Test
    public void shouldNotDetectCycle() {
        LinkedList list= new LinkedList();
        Node one = new Node(1, null);
        Node two = new Node(2, null);
        one.next = two;

        boolean b = list.hasCycle(one);
        System.out.println(b);
    }
}
