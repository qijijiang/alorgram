package HufumanTree;

import java.util.*;

public class TestHufumanTree {
    public static void main(String[] args) {
        String msg="can you can a can as a can canner can a can.";
        byte[] bytes=msg.getBytes();
        byte[] b=huffmanzip(bytes);
        System.out.println(Arrays.toString(b));
        byte[] newBytes=decode(huffCodes,b);
        System.out.println(new String(newBytes));
//
    }
/**
 * 进行霍夫曼编码进行解码
 * **/
    private static byte[] decode(Map<Byte,String> huffCodes, byte[] bytes) {
        StringBuilder sb=new StringBuilder();
        for( int i=0;i<bytes.length;i++){
            byte b=bytes[i];
            boolean flag1=(i==bytes.length-1);
            sb.append(byteToBitStr(!flag1,b));
        }
//        键值对进行交换
        Map<String,Byte> map=new HashMap<String, Byte>();
        for(Map.Entry<Byte,String> entry:huffCodes.entrySet()) {
            map.put(entry.getValue(),entry.getKey());
        }
//        创建一个集合，用于存byte
        List<Byte> list=new ArrayList<Byte>();
//        处理字符串
        for(int i=0;i<sb.length();){
            boolean flag=true;
            int count=1;
            Byte b=null;
            while (flag){
                String key=sb.substring(i,i+count);
            b=map.get(key);
            if(b==null){
                count++;
            }else{
                flag=false;
            }
            }
            list.add(b);
            i=i+count;
        }
          byte[] b=new byte[list.size()];
        for(int i=0;i<b.length;i++){
            b[i]=list.get(i);
        }
return  b;
    }
public static String byteToBitStr(boolean flag,byte b){
        int temp=b;
        if(flag){
        temp|=256;}
        String str= Integer.toBinaryString(temp);

if(flag){
        return  str.substring(str.length()-8);
}
else{
    return str;
}}
    public static byte[] huffmanzip(byte[] bytes){
//        统计数放到一个集合中
        List<Node> nodes =getnodes(bytes);
//        创建霍夫曼编码
        Node Tree=createHuffmanTree(nodes);
//        创建霍夫曼表
        Map<Byte,String> huffCodes=getCodes(Tree);

        System.out.println(huffCodes);

        /**
         * 编码
         * **/
        byte[] b=zip(bytes,huffCodes);

        return b;
    }
/**
 *编码
 * **/
    private static byte[] zip(byte[] bytes, Map<Byte,String> huffCodes) {
        StringBuilder sb=new StringBuilder();
        //处理成二进制的字符串
        for(byte b:bytes){
            sb.append(huffCodes.get(b));
        }

//        定义长度
        int len;
        if(sb.length()%8==0){
            len=sb.length()/8;
        }else{
            len=sb.length()/8+1;
        }
//        压缩后的byte
        byte[] by=new byte[len];
        //记录新的byte的位置
        int index=0;
        for(int i=0;i<sb.length();i+=8){
          String  strByte;
          if(i+8>sb.length()){
              strByte=sb.substring(i);
          }
          else{
              strByte=sb.substring(i,i+8);
          }
          byte byt=(byte)Integer.parseInt(strByte,2);

          System.out.println(strByte+":"+byt);
          by[index]=byt;
          index++;
        }

        return  by;
    }

    public static List<Node> getnodes(byte[] bytes){
        List<Node> nodes=new ArrayList<Node>();
        Map<Byte,Integer> counts=new HashMap<Byte, Integer>();
//        统计次数
        for(byte b:bytes){
           Integer count= counts.get(b);
           if(count==null){
               counts.put(b,1);
           }
           else{
               counts.put(b,count+1);
           }

        }
//        把每一个键值对转化为node对象
        for(Map.Entry<Byte, Integer> m:counts.entrySet()){
            nodes.add(new Node(m.getKey(),m.getValue()));
        }
        return nodes;
    }



    //    霍夫曼树
    public static Node createHuffmanTree(List<Node> nodes){
//        排序

//        sort(nodes);
//        Collections.sort(nodes);


        while(nodes.size()>1){
            Node left=nodes.get(nodes.size()-1);
            Node right=nodes.get(nodes.size()-2);
            Node parent=new Node(null,right.weigth+left.weigth);
            parent.left=left;
            parent.right=right;
            nodes.remove(left);
            nodes.remove(right);
            nodes.add(parent);
            Collections.sort(nodes);
        }
        return nodes.get(0);
    }
//    希尔排序
    public static void sort(List<Node> nodes){
        for(int d=nodes.size()/2;d>0;d/=2){
            for(int i=d;i<nodes.size();i++){
                for(int j=i-d;j>0;j-=d){
                    if(nodes.get(j).weigth<nodes.get(j+d).weigth){
                        Node temp=nodes.get(j);
                        nodes.set(j,nodes.get(j+d));
                        nodes.set(j+d,temp);
                    }
                    }
                }
            }

        }
        static  StringBuilder sb=new StringBuilder();
        static Map<Byte,String> huffCodes=new HashMap<Byte, String>();
    //                    获取霍夫表编码
    /**
     *
     * **/
    public  static Map<Byte,String> getCodes(Node tree) {
        if (tree == null) {
            return null;
        }
        getCodes(tree.left, "0", sb);
        getCodes(tree.right, "1", sb);
        return huffCodes;
    }

    private static void getCodes(Node node,String code,StringBuilder sb){
        StringBuilder sb2=new StringBuilder(sb);
            sb2.append(code);
            if(node.data==null){
                getCodes(node.right,"1",sb2);
                getCodes(node.left,"0",sb2);

            }else{
         huffCodes.put(node.data,sb2.toString());
            }
    }
}
