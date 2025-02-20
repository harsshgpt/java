package Sort;

import java.util.Arrays;

public class rev {
    public static void main(String[] args) {
        int []arr = {2,4,6,8,10,12,14,16,18};
        bfs(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bfs(int[]arr){
        //find mid
        //reverse array after mid
        int mid = arr.length/2;
        //reverse
        int midpoint = (mid+(arr.length-1))/2;
        for(int i = mid+1;i<mid;i++){
         for(int j = arr.length-1;j>=mid;j--){
            int temp = 0 ;
            temp = arr[i];
            arr[i]=arr[j];
            arr[j] = arr[i];
         }

        }
    }
}

