package Recursive;

public class Hannuota {
    public static void main(String[] args) {
Hannuota(3,'A','B','C');
    }
/**
 * @param
 * **/
    public static void Hannuota(int n,char from,char in, char to ){
        if(n==1){
            System.out.println("第1个盘子从"+from+"移到"+to);
        }
        else{
            Hannuota(n-1,from,to,in);
            System.out.println("第"+n+"个盘子从"+from+"移到"+to);
            Hannuota(n-1,in,from,to);
        }
    }
}
