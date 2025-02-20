package binarysearch;

public class infinityarray {
    public static void main(String[] args) {
        int[]arr = {2,4,6,8,10,12,16,18,19,20,26,27,29,32};
        int target = 16;
        int val = ans(arr,target);
        System.out.println(val);
    }
    static int ans(int[]arr,int target){
      int start = 0;  
      int end = 1;
      while(arr[end] < target){
        start = end+1;
        end = end*2;
      }
      System.out.println(end);
      int ans = find(arr,target,start,end);
      return ans;
    }
    static int find (int[]arr, int target,int start ,int end){
        
        while (start<=end){
           int mid = start+(end-start)/2;
            if(arr[mid]<target){
                start = start + 1;
            }else if (arr[mid]>target){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;

    }
}
