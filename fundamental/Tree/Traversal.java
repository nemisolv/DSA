package fundamental.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Traversal {
    // Node - L - R
    public void preOrder(TreeNode root) {
        if (root == null) return;

        // duyet Node truoc
        System.out.print(root.value + " ");

        // duyet cay con ben trai ->phai
        preOrder(root.left);
        preOrder(root.right);

    }

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
//    public List<Integer> preorderTraversal(TreeNode root) {
//        Stack<TreeNode> nodes = new Stack<>();
//        if(root!=null){
//            nodes.push(root);
//        }
//
//        while (!nodes.isEmpty()) {
//            TreeNode curNode = nodes.pop();
//            myList.add(curNode.value);
//            //attention: right behind left because property of stack
//            if(curNode.right!=null){
//                nodes.push(curNode.right);
//            }
//            if(curNode.left!=null){
//                nodes.push(curNode.left);
//            }
//        }
//        return myList;
//    }





    // inOrder : L - Node - R
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return null ;
        TreeNode curNode = root;
        inorderTraversal(root.left);

        myList.add(curNode.value);

        inorderTraversal(root.right);
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
        myWay.inorderTraversal(myBST.root);

    }
}
