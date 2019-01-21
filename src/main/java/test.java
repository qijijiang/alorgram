
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String data[]=new String[]{"1 2 3","2 3 4"};
//        String data1[]=new String[data.length];
        
//        data1=compare(data);


        System.out.println(data);

    }
    public static String[] compare(String[] data) {
        for(int i=0;i<data.length;i++){
            String[] temp= data[i].split(" ");
            if(temp.length!=3){
                return null;
            }else{

            int  x=Integer.parseInt(temp[0])+Integer.parseInt(temp[1]);
           int  y=Integer.valueOf(temp[2]);
           if(x>y){
                data[i]="Case #"+(i+1)+" true";
        }
        else{
               data[i]="Case #"+(i+1)+" false";
           }
        }}
        return data;
    }
}
