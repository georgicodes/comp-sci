/**
 * Created by catrapture on 3/04/2014.
 */
public class LinkedList {

    public Node head = null;

    public void add(int data) {
        if (head == null)
            head = new Node(data, null);
        else {
            Node newHead = new Node(data, head);
            head = newHead;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void reverse() {
        if (head == null || head.next == null)
            return;  //empty or just one node in list

        Node Second = head.next;
        Node Third = Second.next;

        Second.next = head;  //second now points to head
        head.next = null;  //change head pointer to NULL

        if (Third == null)// only two nodes in list
            return;

        Node CurrentNode = Third;
        Node PreviousNode = Second;

        while (CurrentNode != null)
        {
            Node NextNode = CurrentNode.next;
            CurrentNode.next = PreviousNode;

            PreviousNode = CurrentNode;
            CurrentNode = NextNode;
        }

        head  = PreviousNode; //reset the head node
    }
}
