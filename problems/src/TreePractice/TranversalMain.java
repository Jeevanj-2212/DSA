package TreePractice;

public class TranversalMain {
    public static void main(String[] args) {
        BST t = new BST();
        t.insert(50);
        t.insert(40);
        t.insert(60);
        t.insert(30);
        t.insert(45);
        t.insert(70);
        System.out.println(t.inorder(t.root));
        System.out.println(t.preorder(t.root));
        System.out.println(t.postOrder(t.root));

    }
}
