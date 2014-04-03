/**
 * Created by catrapture on 31/03/2014.
 */
public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }

    public boolean add(int data) {
        if (data == this.data)    // don't allow duplicates
            return false;

        if (data < this.data) { // if data < node, recursively search left until leaf spot opens up
            if (left == null) {
                left = new TreeNode(data);
                return true;
            }
            return left.add(data);
        }

        if (data > this.data) {  // if data > node, recursively search right until leaf spot opens up
            if (right == null) {
                right = new TreeNode(data);
                return true;
            }
            return right.add(data);
        }

        return false;
    }
}
