package BinaryTree;

public class TestBinaryTree {
    public static void main(String[] args) {
        BinaryTree bintree = new BinaryTree();
        TreeNode root = new TreeNode(1);
        bintree.setRoot(root);

        TreeNode rootR=new TreeNode(3);
        root.setrNode(rootR);
        TreeNode rootL=new TreeNode(2);
        root.setlNode(rootL);
//        为左节点创建两个子节点
        rootL.setlNode(new TreeNode(4));
        rootL.setrNode(new TreeNode(5));
        rootR.setlNode(new TreeNode(6));
        rootR.setrNode(new TreeNode(7));

//        bintree.frontShow();
//        bintree.midShow();
//        bintree.afterShow();

      bintree.frontNum(1,3);

//        bintree.deleteNode(6);
//        bintree.frontShow();

    }
}
