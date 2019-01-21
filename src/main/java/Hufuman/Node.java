package Hufuman;

public class Node {
    int value;

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    Node leftNode;
    Node rightNode;
    public Node(int value){
        this.value=value;
    }
}
