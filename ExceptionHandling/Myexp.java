package ExceptionHandling;

import java.util.Scanner;

public class Myexp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if(n > 100){
                throw new MyException("My error is handling here.");
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
class MyException extends Exception  {
    public MyException(String myMessage){
      super(myMessage);  
    }
}
