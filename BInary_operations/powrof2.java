package BInary_operations;
public class powrof2 {
    public static void main(String[] args) {
        int n = 2;
        int count = 0 ;
       while(n>0){
        int last = n&1;
        if(last == 1){
            count++;
        }
        n = n>>1;
       }
       if(count == 1){
        System.out.println("it is power of 2");
       }else{
        System.out.println("not the power of 2");
       }
       System.out.println(Math.sqrt(10));
    }
}