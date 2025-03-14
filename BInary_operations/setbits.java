package BInary_operations;

public class setbits {
    public static void main(String[] args) {
        long n = 3;
        int count = 0 ;
        while(n>0){
            if((n&1) == 1){
                count++;
            }
            n= n>>1;
        }
        System.out.println(count);
    }
}
