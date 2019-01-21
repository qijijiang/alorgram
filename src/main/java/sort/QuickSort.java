package sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] b = new int[]{5, 4, 1, 2, 3, 5, 6, 8, 9, 6, 5, 6, 7, 1, 3, 4, 3, 535, 25, 2};
        quickSort(b, 0, b.length - 1);
        System.out.println(Arrays.toString(b));
        fastSort(b, 0, b.length - 1);
        System.out.println(Arrays.toString(b));
    }
    public static void quickSort(int[] arr,int start,int end) {
        if (start < end) {
            int stard = arr[start];
            int low = start;
            int high = end;
            while (low < high) {
                while (low < high && stard <= arr[high]) {
                    high--;
                }
                arr[low] = arr[high];
                while (low < high && arr[low] <= stard) {
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[low] = stard;
            quickSort(arr, start, low);
            quickSort(arr, low + 1, end);
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
