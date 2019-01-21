package ListBinaryTreeNode;

public class ListTreeNode {
//    public int getValue() {
//        return value;
//    }
//
//    public void setValue(int value) {
//        this.value = value;
//    }

    int value;
    ListTreeNode leftNode;
    ListTreeNode rightNode;
public ListTreeNode(int value){
    this.value=value;
}
    public ListTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(ListTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public ListTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(ListTreeNode rightNode) {
        this.rightNode = rightNode;
    }
//  标识
int leftType;
int rightType;
// 实现线索二叉树
//    中序遍历

}
