package dataStructureAlgorithm.dailyLeetCodeChallenge;

public class _700_SearchBST {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {

        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    //way 1: recurson
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val ==val)
            return root;
        if (root.val > val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }

    //way 2: loop

//    public TreeNode searchBST(TreeNode root, int val) {
//        //recursion
//        if (root == null) {
//            return null;
//        }
////        TreeNode root = root;
//        while (root != null) {
//            if (root.val > val) {
//                root = root.left;
//            } else if (root.val < val) {
//                root = root.right;
//            } else
//                return root;
//        }
//        return null;
//    }
}
