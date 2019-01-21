package sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] b=new int[]{5,4,1,2,3,5,6,8,9,6,5,6,7,1,3,4,3,535,25,2};
        MergeSort(b,0,b.length-1);
        System.out.println(Arrays.toString(b));
    }
    public static void MergeSort(int[] arr,int low,int high){
        if(low<high){
        int middle=(high+low)/2;
        MergeSort(arr,low,middle);
        MergeSort(arr,middle+1,high);
        Merge(arr,low,middle,high);
    }}
    public static void Merge(int[] arr,int low,int middle,int high){
        int i=low;
        int j=middle+1;
        int[] temp=new int[high-low+1];
        int index=0;
        while(i<=middle&&j<=high){
            if(arr[i]<arr[j]){
                temp[index]=arr[i];
                i++;
                index++;
            }
            else {
                temp[index]=arr[j];
                j++;
                index++;
            }}
            while(i<=middle){
                temp[index]=arr[i];
                i++;
                index++;
            }
        while(j<=high){
            temp[index]=arr[j];
            j++;
            index++;
        }
        for(int m=0;m<temp.length;m++){
            arr[m+low]=temp[m];
        }
    }}

