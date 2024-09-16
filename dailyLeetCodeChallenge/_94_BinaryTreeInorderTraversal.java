package dailyLeetCodeChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import fundamental.Tree.Traversal;
import fundamental.Tree.TreeNode;
import fundamental.Tree.myBinarySTree;

public class _94_BinaryTreeInorderTraversal {
    public static List  myList = new ArrayList<>();


    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return myList;
        TreeNode curNode = root;
        inorderTraversal(root.left);

        myList.add(curNode.value);

        inorderTraversal(root.right);
        return myList;
    }

    public static List<Integer> inOrderWithoutRecursion(TreeNode root) {
        Stack<TreeNode> nodes = new Stack<>();
        TreeNode current = root;
        while (!nodes.isEmpty() || current != null) {
            if (current != null) {
                nodes.push(current);
                current = current.left;
            } else {
                TreeNode node = nodes.pop();
                myList.add(node.value);
                current = node.right;
            }
        }
        return myList;
    }


    public static void main(String[] args) {
        myBinarySTree myBST = new myBinarySTree();

        myBST.root = myBST.insertNode(myBST.root, 40);
        myBST.root = myBST.insertNode(myBST.root, 30);
        myBST.root = myBST.insertNode(myBST.root, 50);
        myBST.root = myBST.insertNode(myBST.root, 25);
        myBST.root = myBST.insertNode(myBST.root, 35);
        myBST.root = myBST.insertNode(myBST.root, 45);
        myBST.root = myBST.insertNode(myBST.root, 60);
        Traversal myWay = new Traversal();
//        myWay.preOrder(myBST.root);
//        System.out.println(myWay.preorderTraversal(null));
        System.out.println(inOrderWithoutRecursion(myBST.root));

    }

}
