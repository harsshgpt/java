package Binary_operation2;

public class sqrt {
    public static void main(String[] args) {
        int n = 49;
        System.out.println(square(n));
    }
    static int square(int n){
       int start = 0 ;
       int end = n;
       while(start<=end){
        int mid = (start + end)/2;
        if(mid*mid == n){
            return mid;
        }
        if(mid*mid < n){
            start = mid+1;
        }
        if(mid*mid > n){
            end = mid-1;
        }
       }
       return 0;
    }
}
