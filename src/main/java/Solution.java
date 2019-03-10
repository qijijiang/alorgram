import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution=new Solution();
     //   System.out.println(solution.GetUglyNumber_Solution(9));
//       int[] arr={2,1,5,6,2,3};
//       int i=0;
//       System.out.println(i++>0);
        Stack s=new Stack();
        Integer a=1;

        s.add(a);
        System.out.println(Integer.valueOf(String.valueOf( s.pop()))>2);


    }
    public int largestRectangleArea(int[] heights) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(0);
        for(int i=1;i<heights.length-1;i++){
            if(heights[i-1]>heights[i]&&heights[i]<heights[i+1]){
                list.add(i);
            }
        }
        list.add(heights.length-1);
        int[] arr=new int[list.size()-1];
        for(int i=1;i<list.size();i++){
            arr[i-1]=getArea(heights,list.get(i-1),list.get(i));
//           System.out.println(arr[i-1]);
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public int getArea(int[] height,int low, int high){
        System.out.println(low+":"+high);
        int[] heights=new int[high-low+1];
        for(int i=low;i<=high;i++){
            heights[i-low]=height[i];
        }
        Arrays.sort(heights);
        System.out.println(Arrays.toString(heights));
        int max=0;
        for(int i=heights.length-1;i>=0;i--){
            if((heights.length-i)*heights[i]>max){
                max=(heights.length-i)*heights[i];
            }
        }
     System.out.println(max);
        return max;
    }

    public int GetUglyNumber_Solution(int index) {
        if(index<=0){
            return 0;
        }
        int count=0;
        int i=0;
        while(count<index){
            ++i;
            if(isUrly(i)){
                ++count;
            }
        }
        return i;
    }
    public boolean isUrly(int number){
        while(number%2==0){
            number/=2;
        }
        while(number%3==0){
            number/=3;
        }
        while(number%5==0){
            number/=5;
        }
        return (number==1)?true:false;
    }
}
