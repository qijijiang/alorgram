package sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] b=new int[]{5,4,1,2,3,5,6,8,9,6,5,6,7,1,3,4,3,535,25,2};
        insert(b);
        System.out.println(Arrays.toString(b));
    }
    public static void InserSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                int j;
                for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = temp;
            }
        }
//        for(int i=1;i<arr.length;i++){
//            for(int j=i;j>0;j--){
//                if(arr[j]>arr[j-1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j-1];
//                    arr[j-1]=temp;
//                }
//            }
//        }
//      int last=0;
//      int insert=1;
//      while(insert<arr.length){
//      while(last>0&&arr[last]<arr[insert]){
//
//       int   temp= arr[last];
//       arr[last]=arr[insert];
//       arr[insert]=temp;
//       last--;
//      }
//insert++;}
    }
//        public static void quick(int[] arr,int start,int end){
//        if(start<end) {
//            int temp = arr[start];
//            int low = start;
//            int high = end;
//            while (low < high) {
//                while (low < high && arr[high] >= temp) {
//                    high--;
//                }
//                arr[low] = arr[high];
//                while (low < high && arr[low] <= temp) {
//                    low++;
//                }
//                arr[high] = arr[low];
//            }
//                arr[low]=temp;
//                quick(arr,start,low);
//                quick(arr,high+1,end);
//        }
//    }
    public static void insert(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int j;
        if(arr[i+1]<arr[i]){
            int     temp=arr[i+1];

        for(j=i;j>=0&&arr[j]>temp;j--){
            arr[j+1]=arr[j];
        }
        arr[j+1]=temp;
    }

}}}
