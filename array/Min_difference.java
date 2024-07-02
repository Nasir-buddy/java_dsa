import java.util.*;

public class Min_difference {
    static Scanner sc = new Scanner(System.in);

    public static int[] takeInput() {
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static List<List<Integer>> find_difference(int arr[]) {
        List<List<Integer>> ansList = new ArrayList<>();
        Arrays.sort(arr);
        int min_diff = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++) {
            min_diff = Math.min(min_diff, arr[i] - arr[i - 1]);
        }

        for(int i = 1; i < arr.length; i++) {
            if(min_diff == arr[i] - arr[i - 1]) {
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i - 1]);
                temp.add(arr[i]);
                ansList.add(temp);
            }
        }
        return ansList;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        List<List<Integer>> ans = new ArrayList<>(find_difference(arr));
        System.out.println(ans);
    }
}