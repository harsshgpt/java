package Patterns;

public class two {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n ){
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
