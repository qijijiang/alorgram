
import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        int[] a=new int[2];
        int i=0;
       // int a1=cin.nextInt();
        while(cin.hasNext()){
            a[i++]=cin.nextInt();
            if(i==a.length){
                break;
            }
        }
        System.out.println(Arrays.toString(a));
        int[] b=new int[a[0]];
        int j=0;
        while(cin.hasNext()){
            b[j++]=cin.nextInt();
            if(j==b.length){
                break;
            }
        }
        Arrays.sort(b);
        int index=a[1]*2-a[0];
        if(a[1]>=a[0]||a[1]*2<a[0]){
            System.out.println(0);}
        if(b.length==1){
            System.out.println(b[0]);
        }else{
            System.out.println(b[0]+b[b.length-1-index]);
        }
    }
}
