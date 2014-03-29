import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class QueueWith2StacksTest {

    @Test
    public void implementEnqueue() {
        QueueWith2Stacks queue = new QueueWith2Stacks();
        queue.enqueue("1");
        queue.enqueue("2");

        System.out.println("a: " + queue.a.size() + " b:" + queue.b.size());
        System.out.println("a peek 1: " + queue.a.peek());
    }

    @Test
    public void implementDequeue() {
        QueueWith2Stacks queue = new QueueWith2Stacks();
        queue.enqueue("1");
        queue.enqueue("2");
        Object result = queue.dequeue();

        System.out.println("result: " + result);
        System.out.println("a: " + queue.a.size() + " b:" + queue.b.size());
        System.out.println("a peek 1: " + queue.a.peek());
    }


}
