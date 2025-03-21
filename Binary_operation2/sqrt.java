package Binary_operation2;

public class sqrt {
    public static void main(String[] args) {
        int n = 75;
        int p = 3;
        System.out.printf("%.3f",square(n,p));
    }
    //O(logn)
    static double square(int n,int p ){
       int start = 0 ;
       int end = n;
       double root = 0.0;
       while(start<=end){
        int mid = (start + end)/2;
        if(mid*mid == n){
            root =  mid;
            return root;
        }
        if(mid*mid < n){
            start = mid+1;
        }else{
            end = mid-1;
        }
       }
       double incr = 0.1;
       for(int i = 0 ; i<p;i++){
        while (root*root<=n){
            root += incr;
        }
        root-= incr;
        incr /=10;
       }
       return root;
    }
}
