package HufumanTree;

public class Node implements  Comparable<Node>{
    Byte data;

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    Node left;
    Node right;
    int weigth;
    public Node(Byte data,int weigth){
        this.data=data;
        this.weigth=weigth;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", weigth=" + weigth +
                '}';
    }

    public int compareTo(Node o) {
        return o.weigth-this.weigth;
    }
}
