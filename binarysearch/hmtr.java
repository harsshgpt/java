package binarysearch;

public class hmtr {
    public static void main(String[] args) {
       int[]arr = {12,13,14,2,3,4,5,6,7};
       int rt = pivot(arr)+1;
       System.out.println(rt);

    }
    static int pivot(int[]arr){
        int max = 0 ;
        for(int  i = 0 ; i<arr.length;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;

    }
}
