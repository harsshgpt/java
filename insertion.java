public class insertion {
    public static void main(String[] args) {
        int l = 1000000;
        int[] arr = new int[l];

        for(int i =0 ; i<arr.length;i++){
            arr[i] = (int) Math.floor(Math.random()*10000+1);
        }

        for(int i = 1;i<arr.length;i++){
            int j = i-1;
            int key = arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for(int i = 0 ; i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
    }
}
