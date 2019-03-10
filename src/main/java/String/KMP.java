package String;

import java.util.Arrays;

public class KMP {
    public static int Search(String txt,String pat){
        int M=pat.length();
        int R=256;
        int[][] dfa=new int[R][M];
        dfa[pat.charAt(0)][0]=1;
        for(int X=0,j=1;j<M;j++){
            for(int c=0;c<R;c++){
                dfa[c][j]=dfa[c][X];}
            dfa[pat.charAt(j)][j]=j+1;
            X=dfa[pat.charAt(j)][X];
            System.out.println(X);
        }
        int i,j,N=txt.length();
        for(i=0,j=0;i<N&&j<M;i++){
            j=dfa[txt.charAt(i)][j];}
        if(j==M) return i-M;
        else return N;
    }

    public static void main(String[] args) {
        String x="ABABDBAC";
        String s="ABABA";
        System.out.println(Search(x,s));
    }
}
