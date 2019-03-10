package test_test;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int q=in.nextInt();
        int[][] matrix=new int[q][2];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<2;j++){
                matrix[i][j]=in.nextInt();
                if(matrix[i][j]%2==1){
                    matrix[i][j]=- matrix[i][j];
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]*matrix[i][1]>0){
             System.out.println( (matrix[i][0]+matrix[i][1])/2);
            }else{
                if(matrix[i][0]<0){
                    System.out.println((matrix[i][1]+matrix[i][0]+1)/2);
                }else{
                    System.out.println((matrix[i][1]+matrix[i][0]-1)/2);
                }
            }
        }
    }
}
