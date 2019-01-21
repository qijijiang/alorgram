package Thread;
public class DaemonDEmo{
public static class DaemonT extends Thread{
    public void run(){
        while(true){
            System.out.println("I am alive");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws  InterruptedException{
        Thread t=new DaemonT();
        t.setDaemon(true);
        t.start();
        Thread.sleep(2000);
    }
}
}