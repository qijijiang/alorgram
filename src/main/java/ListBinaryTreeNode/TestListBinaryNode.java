package ListBinaryTreeNode;

public class TestListBinaryNode {
    public static void main(String[] args) {
   ListBinaryTree binaryTree=new ListBinaryTree();
   ListTreeNode root =new ListTreeNode(1);
   binaryTree.setRoot(root);
       ListTreeNode n1=new ListTreeNode(2);
       root.setLeftNode(n1);
        ListTreeNode n2=new ListTreeNode(3);
        root.setRightNode(n2);
        ListTreeNode n3=new ListTreeNode(4);
        n1.setLeftNode(n3);
        ListTreeNode n4=new ListTreeNode(5);
       n1.setRightNode(n4);
        ListTreeNode n5=new ListTreeNode(6);
        n2.setLeftNode(n5);
        ListTreeNode n6=new ListTreeNode(7);
        n2.setRightNode(n6);
        binaryTree.afterListShow();
        binaryTree.afterThreadIterate();
    }
}
