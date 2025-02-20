package binarysearch;
public class ciel{
    public static void main(String[] args) {
        int[]arr = {2,3,5,9,14,16,18};
        int target = 1;
        System.out.println(find(arr, target));
    }
    static int find(int[]arr, int target ){
        int start = 0;
        int end = arr.length - 1;
         
        while (start <= end){
            int mid = (start + (end-start)/2); //to avoid overflow like mid = start + end \2
            if(arr[mid]<target){
                start = mid+1;
                
            }else if(arr[mid]>target ){
                end = mid-1;
               
            }else{
                return mid;
            }   
        }

        return arr[start];
    }
}