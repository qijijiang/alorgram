package sort;

import java.util.Arrays;

public class ShellSort_new {
    public static void main(String[] args) {
        int[] b=new int[]{5,4,1,2,3,5,6,8,9,6,5,6,7,1,3,4,3,535,25,2};
        shellSort(b);
        System.out.println(Arrays.toString(b));
    }
    public static void shellSort(int[] arr){
        int h=1;
        while(h<=arr.length/3){
                h=h*3+1;
        }
        System.out.println(h);
        while (h>0){
            for(int i=h;i<arr.length;i++){
                if(arr[i]<arr[i-h]){
                    int tmp=arr[i];
                    int j=i-h;
                    while(j>=0&&arr[j]>tmp){
                        arr[j+h]=arr[j];
                        j-=h;
                    }
                    arr[j+h]=tmp;
                }
            }
            h=(h-1)/3;
            System.out.println(Arrays.toString(arr));
        }
    }
}
