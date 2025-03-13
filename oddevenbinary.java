public class oddevenbinary {
    public static void main(String[] args) {
        int n = 63;
        
        if(isodd(n) == false){
            System.out.println("it is Even");
        }else{
            System.out.println("it is odd");
        }
    }
    static boolean isodd(int n ){
        return (n&1) == 1;
    }
}
