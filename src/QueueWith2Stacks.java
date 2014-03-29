import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * Created by catrapture on 30/03/2014.
 */
public class QueueWith2Stacks {
    public Stack a = new Stack();
    public Stack b = new Stack();

    public void enqueue(Object obj) {
        if (a.isEmpty()) {
            a.push(obj);
        } else {
            while (!a.isEmpty()) {
                b.push(a.pop());
            }
            a.push(obj);

            while (!b.isEmpty()) {
                a.push(b.pop());
            }
        }
    }

    public Object dequeue() {
        if (a.isEmpty())
            throw new NoSuchElementException();

        return a.pop();
    }


}
