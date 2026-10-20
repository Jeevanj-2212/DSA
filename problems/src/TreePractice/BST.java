package TreePractice;

import java.util.ArrayList;
import java.util.List;

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
    int minVal() {
        TreeNode current = root;
        if (root == null) {
            return -1;
        } else {
            while (current.left != null) {
                current = current.left;

            }
            return current.val;
        }
    }
    List<Integer> inorder(TreeNode root) {
        List <Integer>ls = new ArrayList<>();
       inorderHelper(root,ls);
       return ls;
    }

    void inorderHelper(TreeNode node,List<Integer>ls) {
        if(node==null) {
            return;
        }
        inorderHelper(node.left,ls);
        ls.add(node.val);
        inorderHelper(node.right,ls);

    }
    List<Integer> preorder(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        preorderHelper(root,ls);
        return ls;
    }
    void preorderHelper(TreeNode node,List<Integer>ls) {
        if(node==null) {
            return;
        }
        ls.add(node.val);
        preorderHelper(node.left,ls);
        preorderHelper(node.right,ls);
    }

    List<Integer> postOrder(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        postOrderHelper(root,ls);
        return ls;
    }
    void postOrderHelper(TreeNode node,List<Integer>ls) {
        if(node==null) {
            return;
        }
        postOrderHelper(node.left,ls);
        postOrderHelper(node.right,ls);
        ls.add(node.val);
    }

}
