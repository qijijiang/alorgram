package ListBinaryTreeNode;

public class ListBinaryTree {
    ListTreeNode root;
//    临时存取临时节点
    ListTreeNode pre=null;
    public ListTreeNode getRoot() {
        return root;
    }

    public void setRoot(ListTreeNode root) {
        this.root = root;
    }

/**
 *
 * 中序遍历线索二叉树
 *
 *
 * */
    public void midListshow(){
          midListshow(root );
    }
    public void midListshow(ListTreeNode node){
        if(node==null){
            return;
        }
//        处理左子树
        midListshow(node.leftNode);
        if(node.leftNode==null){
            node.leftNode=pre;
            node.leftType=1;
        }
        if(pre!=null&&pre.rightNode==null){
          pre.rightNode=node;
          pre.rightType=1;
        }
        pre=node;

//        处理右子树
        midListshow(node.rightNode);
    }
    /**
     *
     * 后序线索二叉树
     * **/
    public void afterListShow(){
        afterListShow(root);
    }
    public void afterListShow(ListTreeNode node){
        if (node==null){
            return;
        }
//        处理左子树
      afterListShow(node.leftNode);
        afterListShow(node.rightNode);
        if(node.leftNode==null){
            node.leftNode=pre;
            node.leftType=1;
        }
        if(pre!=null&&pre.rightNode==null){
            pre.rightNode=node;
            pre.rightType=1;
        }
        pre=node;
    }
    public void ThreadIterate(){
        ListTreeNode node=root;
        while(node!=null){
            while(node.leftType==0){
                node=node.leftNode;
            }
            System.out.println(node.value);
//            如果当前节点的右指针至向后继节点，有可能后继节点还有
            while(node.rightType==1){
                node=node.rightNode;
                System.out.println(node.value);
            }
           node=node.rightNode;

        }}
        public void afterThreadIterate(){
            ListTreeNode node=root;
            while(node!=null&&node.leftType==0){
                node=node.leftNode;
            }
            ListTreeNode preNode=null;
            while(node!=null){
                if(node.rightType==1){
                    System.out.println(node.value);
                    preNode=node;
                    node=node.rightNode;
                }else{
                    if(node.rightNode==preNode){
                        System.out.println(node.value);
                        if(node==root){
                            return;
                        }
                        preNode=node;
                        node=node;
                    }
                    else{
                        node=node.rightNode;
                        while(node!=null&&node.leftType==0){
                            node=node.leftNode;
                        }
                    }
                }
            }
//            如果当前节点的右指针至向后继节点，有可能后继节点还有

    }
}
