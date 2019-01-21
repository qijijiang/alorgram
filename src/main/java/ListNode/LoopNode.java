package ListNode;

public class LoopNode {
        int data;
        LoopNode next=this;
        public LoopNode(int data) {
            this.data = data;
        }
        public LoopNode append(LoopNode node){
//    this.next=node;
            LoopNode currentNode=this;
            while(true){
//        取下一个节点
                LoopNode nextNode=currentNode.next;
                if(nextNode==null){
                    break;
                }
                currentNode=nextNode;

            }
//    把需要返回的节点追加为找到的当前节点的下一个节点
            currentNode.next=node;
            return  this;
        }
        public LoopNode next(){
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
            LoopNode newNext=next.next;
            this.next=newNext;
        }
        //显示所有节点信息
        public void show(){
            LoopNode currentNode=this;
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
        public void after(LoopNode node){
            node.next=next;
            this.next=node;

        }
//        public static void main(String[] args) {
//            ListNode.Node n1=new ListNode.Node(1);
//            ListNode.Node n2=new ListNode.Node(2);
//            ListNode.Node n3=new ListNode.Node(3);
//            n1.append(n2).append(n3).append(new ListNode.Node(4));
//            n1.show();
//            n2.after(new ListNode.Node(5));
//            n1.show();
////        System.out.println(n1.isLast());
////        System.out.println(n1.next().next().next().isLast());
////        n1.append(n3);
////        System.out.println(n1.next().next().next().getData());
//
//////        System.out.println(n3.next.getData());
//        }
    }


