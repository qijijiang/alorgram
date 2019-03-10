package Sort_new;

import java.util.Arrays;

public class selectSort {
    public static void main(String[] args) {
        int[] b=new int[]{9,6,8,7,0,1,10,4,2};
       // shellSort(b);
        mergeSort(0,b.length-1,b);
        System.out.println(Arrays.toString(b));
    }
    public static void insertSort(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i;j>0&&nums[j]<nums[j-1];j--){
                int temp=nums[j];
                nums[j]=nums[j-1];
                nums[j-1]=temp;
            }
        }
    }
    public static void shellSort(int[] nums){
        int N=nums.length;
        int h=1;
        while(h<N/3){
            h=3*h+1;
        }
        while(h>=1){
            for(int i=h;i<N;i++){
                for(int j=i;j>=h&&nums[j]<nums[j-h];j-=h){
                    int temp=nums[j];
                    nums[j]=nums[j-h];
                    nums[j-h]=temp;
                }
            }
            h/=3;
        }
    }
    public static void mergeSort(int start,int end,int[] nums) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(start, mid, nums);
            mergeSort(mid + 1, end, nums);
            merge(start, mid, end, nums);
        }
    }
    public static void merge(int low,int middle,int high,int[] arr){
        int i=low;
        int j=middle+1;
        int[] temp=new int[high-low+1];
        int index=0;
        while(i<=middle&&j<=high){
            if(arr[i]<arr[j]){
                temp[index++]=arr[i++];
//                i++;
//                index++;
            }
            else {
                temp[index++]=arr[j++];
//                j++;
//                index++;
            }}
        while(i<=middle){
            temp[index++]=arr[i++];
//            i++;
//            index++;
        }
        while(j<=high){
            temp[index++]=arr[j++];
//            j++;
//            index++;
        }
        for(int m=0;m<temp.length;m++){
            arr[m+low]=temp[m];
        }
    }}