package TreePractice;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val,TreeNode left,TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    TreeNode(int val) {
        this(val, null, null);
    }


}
public class MainClass {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(10,new TreeNode(20),new TreeNode(30));
        System.out.println(a.left.val);
        System.out.println(a.right.val);

        BST tree = new BST();
        tree.insert(50);
        tree.insert(40);
        tree.insert(60);
        tree.insert(30);
        tree.insert(12);
        tree.insert(60);
        System.out.println(tree.contains(2));
        System.out.println(tree.contains(60));
        System.out.println(tree.root.val);
        System.out.println(tree.root.left.val);
        System.out.println(tree.root.right.val);
        System.out.println(tree.root.left.left.val);
        System.out.println(tree.root.right.val);
        System.out.println(tree.minVal());


    }
}
