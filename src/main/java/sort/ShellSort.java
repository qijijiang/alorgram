package sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] b=new int[]{5,4,1,2,3,5,6,8,9,6,5,6,7,1,3,4,3,535,25,2};
        ShellSort(b);
        System.out.println(Arrays.toString(b));
    }
    public static void ShellSort(int[] arr){
        int k=1;
     for(int d=arr.length/2;d>0;d/=2){
         for(int i=d;i<arr.length;i++){
             for(int j=i-d;j>=0;j-=d){
                 if(arr[j]>arr[j+d]){
                     int temp=arr[j];
                     arr[j]=arr[j+d];
                     arr[j+d]=temp;
                 }
             }
         }
         System.out.println("第"+k+"次排列结果为："+Arrays.toString(arr));
         k++;
        }
}}
