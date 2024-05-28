package ExceptionHandling;

public class FinallyBloackException {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try {
            System.out.println(arr[8]);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception handled.");
        } finally {
            System.out.println("I will run always.");
        }
        System.out.println("exiting the program");
     }
}
