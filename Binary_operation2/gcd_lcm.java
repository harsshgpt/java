package Binary_operation2;

public class gcd_lcm {
    public static void main(String[] args) {
        System.out.println(gcd(4,9));
    }
    static int gcd(int a ,int b ){
        if(a == 0){
            return b ;
        }
        return gcd(b%a,a);
    }
    static int lcm (int a , int b ){
        
    }
}
