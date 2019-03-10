package test_test;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        String str=cin.nextLine().toLowerCase();
        if(str.length()==1){
            System.out.println(str);
        }
        char[] strs=str.toCharArray();
        boolean flag=true;
        char min='z';
        for(int i=0;i<strs.length-1;i++){
            for(int j=i+1;j<strs.length;j++){
                if(strs[i]<min&&flag){
                    min=strs[i];
                }
                flag=false;
                if(strs[i]==strs[j]){
                    flag=true;
                    break;
                }


                }
            if(!flag){
                break;
            }
            }


        System.out.println(min);
    }

}
