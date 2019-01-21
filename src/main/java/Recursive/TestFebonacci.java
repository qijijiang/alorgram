package Recursive;

public class TestFebonacci {
    public static void main(String[] args) {
       System.out.println(febonacici(4));
    }
    public static int febonacici(int i){
        if(i==1||i==2){
            return  1;
        }
        else {
            return febonacici(i-1)+febonacici(i-2);
        }
    }
}
