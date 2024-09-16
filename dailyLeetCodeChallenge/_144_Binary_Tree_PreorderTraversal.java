package dailyLeetCodeChallenge;

import fundamental.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _144_Binary_Tree_PreorderTraversal {
    List myList = new ArrayList<>();

    //    public List<Integer> preorderTraversal(TreeNode root) {
//        if (root == null) return myList;
//// add truoc
//        myList.add(root.value);
//
//        preorderTraversal(root.left);
//        preorderTraversal(root.right);
//        return myList;
//    }
    //way 2
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> nodes = new Stack<>();
        if(root!=null){
            nodes.push(root);
        }

        while (!nodes.isEmpty()) {
            TreeNode curNode = nodes.pop();
            myList.add(curNode.value);
            //attention: right behind left because property of stack
            if(curNode.right!=null){
                nodes.push(curNode.right);
            }
            if(curNode.left!=null){
                nodes.push(curNode.left);
            }
        }
        return myList;
    }
}




