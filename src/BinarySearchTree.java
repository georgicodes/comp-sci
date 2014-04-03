import java.util.NoSuchElementException;

/**
 * Created by catrapture on 31/03/2014.
 */
public class BinarySearchTree {

    public TreeNode root = null;

    public boolean add(int data) {
        if (root == null) { // if no root, create it
            root = new TreeNode(data);
            return true;
        } else
            return root.add(data); // else recursively search tree for leaf spot
    }

    // Time O (n)
    public void inOrder(TreeNode root) {
        if (root == null) return;

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    // Time O(n)
    public int height(TreeNode root) {
        if (root == null)
            return -1; // need -1 here because a tree with only a root node has a height of 0, so 1 + -1 =0
        System.out.println(root.data);
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // Time O(n)
    public int size(TreeNode root) {
        if (root == null)
            return 0;
        System.out.println(root.data);
        return 1 + size(root.left) + size(root.right);
    }

    // Time O(h) where h = height
    public int findMin() {
        if (root == null) throw new NoSuchElementException();

        while (root != null) {
            System.out.println(root.data);

            if (root.left == null)
                return root.data;
            root = root.left;
        }

        throw new NoSuchElementException();
    }

    // Time O(h) where h = height
    public TreeNode find(TreeNode root, int key) {
        if (root == null) throw new NoSuchElementException();

        while (root != null) {
            if (key < root.data) {
                root = root.left;
            } else if (key > root.data) {
                root = root.right;
            } else {
                return root;
            }
        }

        return null;
    }

    // Time O(n)
    public boolean isBST(TreeNode root, int min, int max) {
        if (root == null)
            return true;

        if (root.data <= min)
            return false;

        if (root.data >= max)
            return false;

        return isBST(root.left, min, root.data) &&
                isBST(root.right, root.data, max);
    }

    // Time O(log n)
    public TreeNode findKth(TreeNode root, int k) {
        if (root == null)
            return null;

        int leftSize = size(root.left);

        if (k <= leftSize)
            return findKth(root.left, k);

        if (k == leftSize + 1)
            return root;

        return findKth(root.right, k - leftSize - 1);
    }
}
