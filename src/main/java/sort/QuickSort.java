package sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] b = new int[]{9,1,3,8,23,5,7,10,29,19};
        quickSort(b, 0, b.length - 1);
        System.out.println(Arrays.toString(b));
//        fastSort(b, 0, b.length - 1);
//        System.out.println(Arrays.toString(b));
    }
    public static void quickSort(int[] arr,int start,int end) {
        if (start < end) {
            int stard = arr[end];
            int low = start;
            int high = end;
            while (low < high) {
                while (low < high && arr[low] >= stard) {
                    low++;
                }
                arr[high] = arr[low];
                while (low < high && stard >= arr[high]) {
                    high--;
                }
                arr[low] = arr[high];
            }
            arr[high] = stard;
            System.out.println(Arrays.toString(arr));
            quickSort(arr, start, high-1);
            quickSort(arr, high , end);
        }
    }
    public static void fastSort(int[] arr,int start ,int end){
        if(start<end){
        int temp=arr[start];
        int low=start;
        int high=end;
        while(low<high){
            while(low<high&&temp<=arr[high]){
                high--;
            }
            arr[low]=arr[high];
            while(low<high&&arr[low]<=temp){
                low++;
            }
            arr[high]=arr[low];
        }
        arr[high]=temp;
        fastSort(arr,start,low);
        fastSort(arr,low+1,end);
    }
}}
