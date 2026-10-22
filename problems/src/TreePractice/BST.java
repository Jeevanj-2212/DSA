package TreePractice;

import java.util.ArrayList;
import java.util.List;

public class BST {
    TreeNode root;
    int count;
    int res;
    int c;

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

    int kthSmallElement(TreeNode node,int k) {
        List <Integer>ls=inorder(node);
        return ls.get(k-1);
    }

    int kthElement(TreeNode node,int k) {
        c= 0;
        res=-1;
        kthInorder(node,k);
        return res;
    }
    void kthInorder (TreeNode node,int k) {
        if(node == null||c==k) {
            return;
        }
        kthInorder(node.left,k);
        c++;
        if(c==k) {
            res = node.val;
        }
        kthInorder(node.right,k);

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

 int countNode(TreeNode root) {
     count=0;
     countHelper(root);
     return count;


 }
 void countHelper(TreeNode root) {
        if(root==null) {
            return;
        }
        else {
            count++;
            countHelper(root.left);
            countHelper(root.right);

        }
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
    int height(TreeNode node) {
        if(node==null) {
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight,rightHeight)+1;

    }

}
