package Bst;


public class BinarySortTree {
   Node root;
   public void add(Node node){
       if(root==null){
           root=node;
       }else{
           root.add(node);
       }
   }
  public void frontshow(){
       root.frontshow();
  }
public Node search(int i){

      return  root.search(i);

}
public void delete(int value){
       if(root==null){
           return;
       }else{
           Node target=search(value);
           if(target==null){
               return;
           }
           Node parent=searchParent(value);
           if(target.left==null&&target.right==null){
               if(parent.left.value==value){
                   parent.left=null;
               }else{
                   parent.right=null;
               }
           }else if(target.left!=null&&target.right!=null){
               //删除右子树中最小的值
               System.out.println(target.left.value);
               int min=deletemin(target.right);
               target.value=min;
               System.out.println(target.value);
           }//只有一个叶节点
           else{
               if(target.left!=null){
                   if(parent.left.value==value){
                       parent.left=target.left;
                   }else{
                       parent.right=target.right;
               }
               }else{
                   if(parent.left.value==value){
                       parent.left=target.left;
                   }else{
                       parent.right=target.right;
               }
           }
       }
}}

private int deletemin(Node node) {
    Node target = node;
    while (target.left != null) {
            target = target.left;
        }
//        删除最小的这个节点
        delete(target.value);
        return  target.value;
    }


    /**
 *
 *
 * **/
public Node searchParent(int value){
    if( root==null){
        return  null;
    }else{
        return root.searchParent(value);
    }
}


/**
 * 平衡二叉树
 * **/

}
