package Bst;

public class TestBinarySortTree {
    public static void main(String[] args) {


    int[] arr=new int[]{1,2,3,4,5,6};
    BinarySortTree bst=new BinarySortTree();
    for(int i:arr){
        bst.add(new Node(i));
    }
//    bst.frontshow();
    System.out.println("================");
System.out.println(bst.root.height());
//    bst.search(4);
//     Node p1=bst.searchParent(9);
//        System.out.println(p1.value);
        /**
         * 删除叶子节点
         * **/
//     bst.delete(7);
//    bst.frontshow();

    }
}
