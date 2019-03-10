package test_test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int m=cin.nextInt();
        int[] color=new int[n];
        for(int i=0;i<n;i++){
            color[i]=cin.nextInt();
        }
        Queue<Integer> q=new LinkedList<Integer>();
        int[] cnt=new int[2001];
        int ans=1000000000;
        int totl=0;
        for(int i=0;i<color.length;i++){
            q.add(color[i]);
            cnt[color[i]]++;
            if(cnt[color[i]]==1 && color[i]!=0)
                totl++;
            while(cnt[q.peek()]>1 || q.peek()==0){
                cnt[q.peek()]--;
                q.remove();
            }
            if(totl==m && ans>q.size())
                ans=q.size();
        }
        if(ans!=1000000000)
            System.out.println(ans);
        else
            System.out.println(-1);
    }
}