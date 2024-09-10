package dataStructureAlgorithm.Tree;

public class myMain {
    public static void main(String[] args) {
       myBinarySTree myBST = new myBinarySTree();
        myBST.root = myBST.insertNode(myBST.root,40);
        myBST.root = myBST.insertNode(myBST.root,30);
        myBST.root = myBST.insertNode(myBST.root,50);
        myBST.root = myBST.insertNode(myBST.root,25);
        myBST.root = myBST.insertNode(myBST.root,35);
        myBST.root = myBST.insertNode(myBST.root,45);
        myBST.root = myBST.insertNode(myBST.root,60);


        System.out.println("Done");
    }
}