package Sort;
public class selectionsort{
    public static void main(String[]args){
        int []arr = {5,4,2,3,1};
        // for(int i = 0 ; i<arr.length;i++){
        //     int updated = arr.length-1-i;
        //     int max = 0 ; 
        //     for(int j = 0 ; j<arr.length;j++){
        //         if(arr[j]>max){
        //             max = j;
        //         }
        //     }
        //     System.out.println("max is "+max);
        //     int temp = arr[max];
        //     arr[max]= arr[updated];
        //     arr[updated]=temp;
        // }
        // for(int i = 0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }
        

        // find the max in array 
        int temp = 0 ;
        for(int i = 0 ; i< arr.length;i++){
            if(arr[i]>temp){
                System.out.println(arr[i]);
                temp = arr[i];
            }
        }
    }
}