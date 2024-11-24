import java.util.Arrays;

public class InsertionSortRecursive {
    public int[] sort(int[] arr, int n){
        if (n == 1) return arr;
        arr = sort(arr, n-1);
        for(int i = n-2; i >= 0; i--){
            if (arr[i] <= arr[i+1]) break;
            int temp = arr[i+1];
            arr[i+1] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        InsertionSortRecursive obj = new InsertionSortRecursive();
        int arr[] = {3, 2, 4, 2, 5};
        int n = 5;
        System.out.println(Arrays.toString(obj.sort(arr, n)));
    }
}
