package BinaryTree;

public class BinaryTree {
    TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
  public void frontShow(){
        root.frontShow();
  }
  public void midShow(){
        root.midShow();
  }
public void afterShow(){
        root.afterShow();
    }
    public TreeNode frontSearch(int i){
        return root.frontSearch(i);
    }
    public void frontNum(int k,int i){
        root.frontNum(k,i);
    }
    public void deleteNode(int i){
        if(root.value==i){
           root=  null;
        }
        else{
             root.deleteNode(i);
        }
    }
}
