package test_test;

import java.util.Scanner;

public class test360 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int M = cin.nextInt();
        int N = cin.nextInt();
        int k = cin.nextInt();
        int[][] matrix = new int[M][N];
        int index=Math.max(M,N);
        int[] row=new int[index];
        int[] col=new int[index];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = cin.nextInt();
            }
        }
        int count = 0;
        int rowIndex=0;
        int colIndex=0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if(getNum(i-1,j,matrix,M,N)&&
                        getNum(i,j,matrix,M,N)&&getNum(i+1,j,matrix,M,N)
                        &&getNum(i,j-1,matrix,M,N)&&getNum(i,j+1,matrix,M,N)){
                    count++;
                    if(count==1){
                        row[rowIndex++]=i;
                        col[colIndex++]=j;
                    }else if(count==k){
                        row[rowIndex++]=i;
                        col[colIndex++]=j;
                        count=0;
                    }
                }
            }
        }

    }

    public static boolean getNum(int i, int j, int[][] matrix, int m, int n) {
        if (i >= m || j >= n || i<0||j<0||matrix[i][j] == 0) {
            return false;
        } else {
            return true;
        }

    }
}
