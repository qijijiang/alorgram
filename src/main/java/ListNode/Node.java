package ListNode;


public class Node {
int data;
Node next;
public Node(int data){
    this.data=data;
}
public Node append(Node node){
//    this.next=node;
    Node currentNode=this;
        while(true){
//        取下一个节点
        Node nextNode=currentNode.next;
        if(nextNode==null){
            break;
        }
        currentNode=nextNode;

    }
//    把需要返回的节点追加为找到的当前节点的下一个节点
    currentNode.next=node;
        return  this;
}
public Node next(){
    return  this.next;
}
public int getData(){
    return this.data;
}
//判断是否为最后一个节点
public boolean isLast(){
    if (next==null){
        return true;
    }else{
        return false;
    }
}
///删除下一个节点
public void removeNext(){
    Node newNext=next.next;
    this.next=newNext;
}
//显示所有节点信息
    public void show(){
    Node currentNode=this;
    while (true) {
        System.out.print(currentNode.data+" ");
        currentNode = currentNode.next;
        if (currentNode == null) {
            break;
        }
    }
    System.out.println(" ");
    }
//插入节点
    public void after(Node node){
    node.next=next;
    this.next=node;

    }
    public static void main(String[] args) {
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        n1.append(n2).append(n3).append(new Node(4));
        n1.show();
        n2.after(new Node(5));
        n1.show();
//        System.out.println(n1.isLast());
//        System.out.println(n1.next().next().next().isLast());
//        n1.append(n3);
//        System.out.println(n1.next().next().next().getData());

////        System.out.println(n3.next.getData());
    }
}
