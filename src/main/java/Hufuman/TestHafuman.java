package Hufuman;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestHafuman {
    public static void main(String[] args) {
        int arr[]={3,7,8,29,5,11,23,14};
        Node node=createHuffmanTree(arr);

    }
    public static Node createHuffmanTree(int[] arr){
        List<Node> nodes=new ArrayList<Node>();
        for(int value:arr) {
            nodes.add(new Node(value));
        }


        while(nodes.size()>1){
           sort(nodes,0,nodes.size());
//           权值最小的二叉树

           Node left=nodes.get(nodes.size()-1);
           Node right=nodes.get(nodes.size()-2);
           Node parent=new Node(right.value+left.value);
           nodes.remove(left);
           nodes.remove(right);
           nodes.add(parent);
        }
        System.out.println(nodes.get(0).value);
        return  null;
    }
    public static void sort(List<Node> nodes,int start,int end){
        if(start<end){
           Node stard=nodes.get(start);
            int low= start;
            int high=end;
            while(low<high){
            while(low < high&&nodes.indexOf(high)< stard.value){
                high--;
            }
            nodes.set(low,nodes.get(high));

            while(low < high&&nodes.indexOf(low)>stard.value){
                low++;
            }
                nodes.set(high,nodes.get(low));
        }
            nodes.set(high,stard);
            sort(nodes,start,low);
            sort(nodes,low+1,end);

        }
    }
}
