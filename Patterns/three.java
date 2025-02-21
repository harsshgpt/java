package Patterns;
public class three{
    public static void main(String[] args) {
        pattern(9);
    }
    static void pattern (int n){
        int k = (n+1)/2;
        for(int i = 1 ; i<=n ;i++){
            if(i<=k){
                //direct
                for(int j = 1; j<=i;j++){
                    System.out.print("*");
                }
            }else{
                //indirect
                for(int j = n-i+1; j>=1;j--){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}