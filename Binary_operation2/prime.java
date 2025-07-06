package Binary_operation2;
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        System.out.println("The all prime numbers till " + n +" is =>");
        for(int i = 2; i <= n;i++){
            
            if(n%i!=0 || i==2){
               
            System.out.println(i);} 
        }  
    }
}
