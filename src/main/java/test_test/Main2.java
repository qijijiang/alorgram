package test_test;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int s=cin.nextInt();
        int[] index=new int[n];
        for(int i=0;i<n;i++){
           index[i]=cin.nextInt();
        }
          long result=1;
        int pre=n;
        int next=s;
        int i=0;
       while(i<s){
           result*=n;
           i++;
           n--;
       }
       while(s>1){
           result=result/s;
           s--;
       }
      for(int j=0;j<pre-next;j++){
           result=result*2;
      }
        System.out.println((long)(result%(1e9+7)));
    }
}
