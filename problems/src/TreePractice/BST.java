package TreePractice;

public class BST {
    TreeNode root;

    void insert(int val) {
        TreeNode current = root;
        while (true) {

            if (root == null) {
                root = new TreeNode(val);
                return;

            } else if (val < current.val) {

                if (current.left == null) {
                    current.left = new TreeNode(val);
                    return;
                }
                else {
                    current=current.left;
                }
            } else {
                if (current.right == null) {
                    current.right = new TreeNode(val);
                    return;
                }
                else {
                    current=current.right;
                }
            }
        }
    }
    boolean contains(int val) {
        TreeNode current = root;
        while (true) {
            if (current == null) {
                return false;
            }
            if (current.val == val) {
                return true;
            }
            if (val < current.val) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
    }
}
