package Bst;

public class Node {
    int value ;
    Node left;
    Node right;
    public Node(int value){
        this.value=value;
    }
    public void add(Node node){
        if(node==null){
            return;
        }
        if(node.value<this.value){
            if(this.left==null){
                left=node;
            }else{
                left.add(node);
            }
        }else{
            if(this.right==null){
                this.right=node;
            }else{
                right.add(node);
            }
        }
        /**
         * 平衡二叉树
         *
         * **/
        if(leftHeight()-rightHeight()>=2){
            if(left!=null&&left.leftHeight()<left.rightHeight()){
                left.leftRotate();
                this.rightRotate();
            }

        }
        if(leftHeight()-rightHeight()<=-2){
            if(right!=null&&right.rightHeight()<right.leftHeight()){
                right.rightRotate();
               this.leftRotate();
        }}
    }

    private void leftRotate() {
        Node newNode=new Node(value);
        //把新节点的左子树设置为当前节点的左子树子树
        newNode.left=left;
        //把新节点的左子树设置为当前节点的左子树的右子树
        newNode.right=right.right;
        value=right.value;
        right=right.right;
        left=newNode;
    }

    private void rightRotate() {
        //创建新节点
        Node newNode=new Node(value);
        //把新节点的右子树设置为当前节点的右子树
        newNode.right=right;
        //把新节点的左子树设置为当前节点的左子树的右子树
        newNode.left=left.right;
        value=left.value;
        left=left.left;
        right=newNode;
    }

    public void frontshow(){

        System.out.println(value);
        if(left!=null){
            left.frontshow();
        }
        if(right!=null){
            right.frontshow();
        }
    }
    public Node search(int var){
        if(this.value ==var){
            return this;
        }
       else if(this.value>var){
            if(this.left==null){
                return  null;
            }
            return left.search(var);
        }
            else if(this.value<var){
            if(this.right==null){
                return null;
            }
            return right.search(var);

        }
     else {
            return null;
        }
    }
    public Node searchParent(int value){
        if((this.left!=null&&this.left.value==value)||(this.right!=null&&this.right.value==value)){
            return this;
        }else{
            if(this.value>value){
                return this.left.searchParent(value);
            }else if(this.value<value&&this.right!=null){
                return this.right.searchParent(value);
            }
            return null;
        }
    }
    /**
     *
     * 平衡二叉树
     * **/
    public int height(){
        return  Math.max(left==null?0:left.height()+1,right==null?0:right.height())+1;
    }
    public int leftHeight(){
        if(left==null){
            return  0;
        }else{
            return left.height();
        }
    }
    public int rightHeight(){
        if(right==null){
            return  0;
        }else{
            return right.height();
        }
    }
}
