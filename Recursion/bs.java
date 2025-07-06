package Recursion;

public class bs {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int index = bs(arr, 15, 0, arr.length-1);
        if(index == -1){
            System.out.println("index not found");
        }else{
        System.out.println(index);}
    }
    static int bs(int []arr,int target,int s ,int e  ){
         if(s>e){
            return -1;
         }
         int mid = s+(e-s)/2;
         if(arr[mid] == target){
            return mid;
         }else if (target>arr[mid]){
            s = mid+1;
         }
         else if (target<arr[mid]){
            e = mid-1;
         }
         return bs(arr, target, s, e);
        
    }
}
