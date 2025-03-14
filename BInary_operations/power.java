package BInary_operations;

public class power {
    public static void main(String[] args) {  
        int base = 2;
        int power = 4646494;
        int ans = 1 ;
        while(base>0){
            if((power&1) == 1){
            ans *= base;
            }
            base *= base;
            power = power>>1;

        }
        System.out.println(ans);
    }
}
