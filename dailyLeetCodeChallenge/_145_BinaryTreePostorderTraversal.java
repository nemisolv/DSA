package dataStructureAlgorithm.dailyLeetCodeChallenge;
import dataStructureAlgorithm.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _145_BinaryTreePostorderTraversal {
    //postOrder: L - R - Node
        List myList = new ArrayList<>();
        public List<Integer> postorderTraversal(TreeNode root) {
            if(root==null) return myList;

                postorderTraversal(root.right);
                postorderTraversal(root.left);
                myList.add(root.value);

            return myList;
        }
}
