package sort;


import java.util.Arrays;

public class ReadixSort {
    public static void main(String[] args) {
        int[] b=new int[]{5,4,11,22,33,55,6,85,95,61,5,6,7,1,3,4,3,535,25,2};
        ReadixSort(b);
//        System.out.println(Arrays.toString(b));
    }
    public static void ReadixSort(int[] arr){
        int max=Integer.MAX_VALUE;
        int temp = 0;
        for(int i=0;i<arr.length-1;i++){
           if(arr[i]<arr[i+1]){
                temp=arr[i+1];
           }
        }
        int[] counts=new int[10];
        int[][] a=new int[10][arr.length];
          max=(temp+"").length();
        for(int i=0,n=1;i<max;i++,n*=10){
            int index=0;
            for(int j=0;j<arr.length;j++){
                 index=arr[j]/n%10;
                a[index][counts[index]]=arr[j];
                counts[index]++;

            }
                int start=0;
            for(int k=0;k<counts.length;k++){
           if(counts[k]!=0){
               for(int l=0;l<counts[k];l++){
                   arr[start]=a[k][l];
                   start++;
               }

               counts[k]=0;
           }
                }
            System.out.println(Arrays.toString(arr));
           }
        }
}


