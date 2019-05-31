package sort;

/**
 * @Author: QiJiJiang
 * @Date: Create in 下午 7:33 2019-03-27
 */
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        int n=Integer.parseInt(cin.nextLine());
        String s=cin.nextLine();
        List<Integer> list=new ArrayList<Integer>();
        String ss="";
        for(int i=0;i<s.length();i+=9){
            if(i!=0){
                ss+=" ";
            }
            if(s.charAt(i)=='0'){
                char[] str=s.substring(i+1,i+9).toCharArray();
                Arrays.sort(str);
                for(int j=7;j>=0;j--){
                    ss+=str[j];
                }
            }
            if(s.charAt(i)=='1'){
                char[] str=s.substring(i+1,i+9).toCharArray();
                Arrays.sort(str);
                for(int j=0;j<=7;j++){
                    ss+=str[j];
                }
            }
        }

        System.out.println(ss);

    }
}