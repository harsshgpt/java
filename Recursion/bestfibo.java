package Recursion;

public class bestfibo {
    public static void main(String[] args) {
        for(int i = 1 ; i<=50;i++){
            System.out.println(fibo(i));
        }
    }
    static long fibo(int n ){
        return (long) (Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
}
