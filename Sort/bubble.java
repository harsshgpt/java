package Sort;
public class bubble {
    public static void main(String[] args) {
        int [] arr = {5,6,8,7,4,2,1,2};
        for(int i = 0; i<arr.length;i++){
            for(int j = 1; j<arr.length-i;j++){
                int temp = 0;
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
} 


