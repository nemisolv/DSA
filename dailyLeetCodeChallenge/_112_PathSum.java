package dataStructureAlgorithm.dailyLeetCodeChallenge;

import dataStructureAlgorithm.Tree.TreeNode;

public class _112_PathSum {
    public boolean isLeaf(TreeNode curNode) {
        return curNode.left == null && curNode.right == null;
    }


    public boolean hasPathSum(TreeNode root, int targetSum) {

        return traversal(root, 0, targetSum);

    }

    public boolean traversal(TreeNode curNode, int curSum, int targetSum) {
        // dieu kien dung | bai toan co so
        // vì ta chỉ duyệt đến node leaf nên khi node là null return false;
        if (curNode == null) return false;
        curSum += curNode.value;
        if (isLeaf(curNode)) {
            return curSum == targetSum;
        }
        boolean sumOfLeft = traversal(curNode.left, curSum, targetSum);
        boolean sumOfRight = traversal(curNode.right, curSum, targetSum);
        return sumOfLeft || sumOfRight;
    }

    public static void main(String[] args) {

    }
}
