package test_test;

import java.util.Scanner;

/**
 *
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int d=in.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
            b[i]=in.nextInt();
        }
        qucikSort(a,b,0,n-1);
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>0;i--){
            for(int j=i-1;j>=0;j--){
                if(Math.abs(a[i]-a[j])>d){
                    max=Math.max(max,b[i]+b[j]);
                    break;
                }
            }
        }
        System.out.println(max);
    }
    public static void qucikSort(int[] a,int[] b,int start,int end){
        if(start<end){
            int index=b[start];
            int temp=a[start];
            int low=start;
            int high=end;
            while(low<high){
                while(b[high]>=index&&high>low){
                    high--;
                }
                b[low]=b[high];
                a[low]=a[high];
                while (b[low]<=index&&low<high){
                    low++;
                }
               b[high]=b[low];
                a[high]=a[low];
            }
            a[low]=temp;
            b[low]=index;
            qucikSort(a,b,start,low);
            qucikSort(a,b,low+1,end);
        }
    }
}
