package Binary_operation2;

public class gcd_lcm {
    public static void main(String[] args) {
        System.out.println(gcd(16,20));
    }
    static int gcd(int a ,int b ){
        if(a == 0){
            return b ;
        }
        return gcd(b%a,a);
    }
}
