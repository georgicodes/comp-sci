import org.junit.Test;

/**
 * Created by catrapture on 31/03/2014.
 */
public class BinarySearchTreeTest {

    @Test
    public void shouldPrintInOrder() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        tree.add(2);
        tree.add(18);
        tree.add(-4);
        tree.add(3);

        tree.inOrder(tree.root);
    }

    @Test
    public void shouldPrintHeight() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        tree.add(2);
        tree.add(18);
        tree.add(-4);
        tree.add(3);

        int result = tree.height(tree.root);
        System.out.println("result: " + result);
    }

    @Test
    public void shouldPrintSize() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        tree.add(2);
        tree.add(18);
        tree.add(-4);
        tree.add(3);

        int result = tree.size(tree.root);
        System.out.println("result: " + result);
    }

    @Test
    public void shouldFindMin() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        tree.add(2);
        tree.add(18);
        tree.add(-4);
        tree.add(3);

        int result = tree.findMin();
        System.out.println("result " + result);
    }

    @Test
    public void shouldFindKey() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        tree.add(2);
        tree.add(18);
        tree.add(-4);
        tree.add(3);

        int result = tree.find(tree.root, -4).data;
        System.out.println("result " + result);
    }

    @Test
    public void isBST() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        tree.add(2);
        tree.add(18);
        tree.add(-4);
        tree.add(3);

        boolean result = tree.isBST(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println("result " + result);
    }

    @Test
    public void findKthNode() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(3);
        tree.add(1);
        tree.add(2);
        tree.add(5);
        tree.add(8);

        // find the 2nd smallest
        TreeNode result = tree.findKth(tree.root, 4);
        System.out.println("result " + result.data);
    }
}
