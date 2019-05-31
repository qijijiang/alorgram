package sort;

import java.util.Arrays;
public class Bubble {
    public static void main(String[] args) {
        int[] b=new int[]{5,4,1,2,3,5,6,8,9,6,5,6,7,1,3,4,3,535,25,2};
        long start= System.currentTimeMillis();
        BubbleSort(b);
        long end=System.currentTimeMillis();
        System.out.println(Arrays.toString(b));
        System.out.println(start-end);
    }
    public static void BubbleSort(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }

    }
}
