package sort;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ForkJoinPool;

public class currencySort {
    static int exchFlag=1;
    static synchronized void setExchFlag(int v){
        exchFlag=1;
    }
    static synchronized  int getExchFlag(){
        return exchFlag;
    }
    public static class OddEvenSortTask implements Runnable{
        int arr[];
        int i;
        CountDownLatch latch;
  public OddEvenSortTask(int i, CountDownLatch latch) {
      this.i = i;
      this.latch = latch;
  }
        public void run() {
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
            }
        }
        public static void pOddevenSort(int[] arr) throws InterruptedException{

        }

    }

}
