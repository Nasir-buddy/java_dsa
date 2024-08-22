import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class TwoSum {
    static Scanner sc = new Scanner(System.in);
    public static int[] takeInput(){
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the element of the array : ");
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static List<List<Integer>> twoSum(int arr[], int k){
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length - 1; 
        List<List<Integer>> ans = new ArrayList<>();
        while(l < r){
            if(arr[l] + arr[r] > k){
                r--;
            } else if(arr[l] + arr[r] < k){
                l++;
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[l]);
                temp.add(arr[r]);
                ans.add(temp);
                l++;
                r--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        System.out.println("Enter the sum of the kth element.");
        int k = sc.nextInt();
        List<List<Integer>> ans = new ArrayList<>(twoSum(arr, k));
        System.out.println(ans);
    }
}
