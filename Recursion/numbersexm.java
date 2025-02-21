package Recursion;

public class numbersexm {
    public static void main(String[] args) {
        num(1);
    }

    static void num(int a ){
      if(a > 5){
        return;
      }
      System.out.println(a);
      num(a+1);
    }
   
    }

