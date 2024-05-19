import java.util.Scanner;

public class arrayInput{
    static Scanner sc = new Scanner(System.in);
    // taking input in the array 
    public static int[] takeInput(){
        System.out.println("Enter the size of the arrar : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the element of the array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    // printing the array 
    public static void printArray(int arr[]){
        for(int i : arr){
            System.out.println(i);
        }
    }
    //  main function 
    public static void main(String[] args) {
        int arr[] = takeInput();
        printArray(arr);
    }
}