package BinaryTree;

public class TreeNode {
    int value;
    TreeNode lNode;
    TreeNode rNode;
    public TreeNode getrNode() {
        return rNode;
    }
    public void setrNode(TreeNode rNode) {
        this.rNode = rNode;
    }
    public TreeNode getlNode() {
        return lNode;
    }

    public void setlNode(TreeNode lNode) {
        this.lNode = lNode;
    }
    public TreeNode(int value){
        this.value=value;

    }
//    前序遍历
public void frontShow(){
        System.out.println(value);
//        左节点
        if(lNode!=null){
            lNode.frontShow();
        }
//        右节点
    if(rNode!=null){
        rNode.frontShow();
    }
}
//中序遍历
    public void midShow(){
        if(lNode!=null){
       lNode.midShow();}
       System.out.println(value);
        if(rNode!=null){
            rNode.midShow();}
    }
    public void afterShow(){
        if(lNode!=null){
            lNode.afterShow();
        }
        if(rNode!=null){
            rNode.afterShow();}
            System.out.println(value);
    }
//    前序寻找
    public TreeNode frontSearch(int i){
        TreeNode target=null;
        if(this.value==i){
            return this;
        }
        else{ if(lNode!=null){
           target= lNode.frontSearch(i);
        }
              if(target!=null){
            return  target;
}
       else if(rNode!=null){
            target=rNode.frontSearch(i);
        }
        if(target!=null){
            return target;
        }
        return  null;
    }
}
//前序遍历次数
public  void frontNum(int k,int i){

if(this.value==i){
    k=k+1;
}
//        左节点
   else { if(lNode!=null){

     lNode.frontNum(k+1,i);

    }


//        右节点
    if (rNode!=null){
     rNode.frontNum(k+1,i);
    }

    }
    System.out.println(k);
}
public void deleteNode(int i){
        if(lNode!=null&&lNode.value==i){
            this.lNode=null;
        }
    if(rNode!=null&&rNode.value==i){
        this.rNode=null;
    }
    else{
            if(lNode!=null){
            lNode.deleteNode(i);}

    if(rNode!=null){
        rNode.deleteNode(i);}}

}
}

