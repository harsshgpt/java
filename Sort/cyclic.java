package Sort;

import java.util.Arrays;

public class cyclic {
   public static void main(String[]args){
    int[]arr = {4,3,2,7,8,2,3,1};
     cyclic(arr);
     System.out.println(Arrays.toString(arr));
   }
   static void cyclic(int[]arr){
    for(int i = 0; i<arr.length;i++){
        while(arr[i] != arr[arr[i]-1]){
            int ci = arr[i]-1;
            int temp = arr[i];
            arr[i] = arr[ci];
            arr[ci] = temp;
        }
       }
       
   }
}
