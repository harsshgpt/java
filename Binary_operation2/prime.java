package Binary_operation2;
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        System.out.println("The all factors of "+n+ " 36is");
        for(int i = 2; i <= n/2;i++){
            
            if(n%i==0){
               
            System.out.println(i);}
        }  
    }
}
