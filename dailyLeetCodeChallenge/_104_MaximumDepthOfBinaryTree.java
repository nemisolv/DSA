package dailyLeetCodeChallenge;
import  fundamental.Tree.TreeNode;

public class _104_MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        //condition stop
        if(root==null){
            return 0;
        }
        int heightOfChildTreeLeft = maxDepth(root.left);
        int heightOfChildTreeRight = maxDepth(root.right);
        int result = Math.max(heightOfChildTreeLeft,heightOfChildTreeRight)+1;

        return result;
    }
    public static void main(String[] args) {

    }
}
