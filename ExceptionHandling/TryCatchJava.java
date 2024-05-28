package ExceptionHandling;

public class TryCatchJava {
    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            System.out.println(a[8]);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Error to find the index. ");
        } catch (RuntimeException e){
            System.out.println("handling the error.");
        }
        System.out.println("Hello Sir");
    }
}
