package Sort;

import java.util.Arrays;

public class insertion{
    public static void main(String[] args) {
        int []arr = {3,5,2,1,4};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void insertion(int[]arr){
        for(int i = 0 ; i<=(arr.length-2);i++){
            for(int j = i+1; j>0;j--){
                if(arr[j-1] > arr[j] ){
                    int temp = 0 ;
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;      
                }else if (arr[j-1]<arr[j]){
                    break;
                }
            }
        }
        
    }
    
}