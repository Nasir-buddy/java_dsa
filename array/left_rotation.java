import java.util.Scanner;

public class left_rotation {
    static Scanner sc = new Scanner(System.in);
    public static int[] takeInput(){
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int newArr[] = new int[n];
        for(int i = 0; i < newArr.length; i++){
            newArr[i] = sc.nextInt();
        }
        return newArr;
    }
    public static void printArray(int arr[]){
        for(int i : arr){
            System.out.println(i);
        }
    }
    // public static void left_rotation(int arr[], int k){
    //     int n = arr.length;
    //     for(int i = 0; i < k; i++){
    //         int temp = arr[0];
    //         for(int j = 1; j < arr.length - 1; j++){
    //             arr[j] = arr[j + 1];
    //         }
    //         arr[n - 1] = temp;
    //     }
    // }

    // Optimal Approach 
    public static void rotation(int arr[], int k){
        // to avoid unnecessary operations
        k = k % arr.length;
        reverse(arr, 0, arr.length - k - 1);
        reverse(arr, arr.length - k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }
    public static void reverse(int arr[], int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        System.out.println("Enter the no of rotataion.");
        int k = sc.nextInt();
        rotation(arr ,k);
        printArray(arr);
    }
}
