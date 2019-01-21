package sort;



import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;


public class QueueReadixSort {
    public static void main(String[] args) {
        int[] b=new int[]{5,4,11,22,33,55,6,85,95,61,5,6,7,1,3,4,3,535,25,2};
        QueueReadixSort(b);
        System.out.println(Arrays.toString(b));
    }
    public static void QueueReadixSort(int[] arr){
        int max=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                 max=arr[i];
            }}

            max=(max+"").length();
        System.out.println(max);
            Queue[] queue=new Queue[10];
           for(int i=0;i<queue.length;i++){
               queue[i]=new LinkedBlockingQueue();
           }
            int index=0;
            for(int i=0,n=1;i<max;i++,n*=10){
                for(int j=0;j<arr.length;j++){
                 index=arr[j]/n%10;
                 queue[index].add(arr[j]);
        }
        int start=0;
        for(int k=0;k<queue.length;k++)
            while (!queue[k].isEmpty()) {
                arr[start] = Integer.parseInt(String.valueOf(queue[k].remove()));
                start++;
            }
            System.out.println(Arrays.toString(arr));
    }
}}
