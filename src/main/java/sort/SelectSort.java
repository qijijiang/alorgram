package sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] b=new int[]{5,4,1,2,3,5,6,8,9,6,5,6,7,1,3,4,3,535,25,2};
        SelectSort(b);
        System.out.println(Arrays.toString(b));
    }
    public static void SelectSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int temp=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[temp]>arr[j]){
                    temp=j;
                }
                if(i!=temp){
                int moster=arr[i];
                arr[i]=arr[temp];
                arr[temp]=moster;}
            }

        }
    }
}
