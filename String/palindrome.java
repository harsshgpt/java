package String;
public class palindrome {
   public static void main(String[] args) {
    String name = "abccba";

     char[] ih=  name.toCharArray();
     boolean ans = true;
     for(int i = 0 ; i<ih.length/2;i++){
       int end = ih.length-i-1;
       if(ih[i]!=ih[end]){
        ans =  false;
       }
     }
     if(ans == true){
        System.out.println("it is a palindrome");
     }else{
        System.out.println("it is not a palindrome");
     }
   } 
   
   
}
