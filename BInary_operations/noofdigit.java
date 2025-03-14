package BInary_operations;

public class noofdigit {
    public static void main(String[] args) {   //complexity is log n    
        int n = 10;
        int b = 2;
        
        int digit = ((int)(Math.log(n)/Math.log(b))+1);
        System.out.println(digit);
    }
}
