package fundamental.TreeDesign;

public class MyMainTree {
    private TreeNode root;
    MyMainTree() {

    }
    void init() {
        TreeNode n0 = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(5);
        TreeNode n4 = new TreeNode(6);

        n0.left = n1;n0.right = n2;
        n1.left = n3; n1.right = n4;

        root =n0;
    }


}
