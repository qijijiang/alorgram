package sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class oddEvenSort {
    public static void main(String[] args) {
        int[] arr={2,1,3,4,6,4,3,5,6,4,8};
        oddEvenSort(arr);
    }
    public static void oddEvenSort(int[] arr){
        int exchFlag=1,start=0;
        while(exchFlag==1||start==0){
            exchFlag=0;
            for(int i=start;i<arr.length-1;i+=2){
                if(arr[i]>arr[i+1]){
                        int temp=arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=temp;
                        exchFlag=1;
                }
            }
            if(start==0)
                start=1;
            else
                start=0;
            System.out.println(Arrays.toString(arr));
        }
    }

}
