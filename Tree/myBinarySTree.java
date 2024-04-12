package dataStructureAlgorithm.Tree;

public class myBinarySTree {

    public TreeNode root;

    public TreeNode insertNode(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);
        if (root == null) {
            root = newNode;
        } else {
            TreeNode temp = root;
            while (true) {
                if (temp.value < val) {
                    if (temp.right == null) {
                        temp.right = newNode;
                        break;
                    } else {
                        temp = temp.right;
                    }
                } else if (temp.value > val) {
                    if (temp.left == null) {
                        temp.left = newNode;
                        break;
                    } else {
                        temp = temp.left;
                    }
                }
            }
        }
        return root;
    }


}