import java.util.*;
public class QuickSort {
    int[] quickSort(int[] arr, int left, int right){
        if (left >= right) return arr;

        for(int i = 0, j = 0; i < right; i++){
            if (arr[i] <= arr[right]){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
            if (i == right - 1){
                int temp = arr[j];
                arr[j] = arr[right];
                arr[right] = temp;
                quickSort(arr, left, j-1);
                quickSort(arr, j+1, right);
            }
        }

        return arr;
        
    }
    public int[] sort(int[] arr, int n){
        return quickSort(arr, 0, n-1);
    }

    public static void main(String[] args) {
        QuickSort obj = new QuickSort();
        int arr[] = {4,3,1,2,5};
        int n = 5;
        System.out.println(Arrays.toString(obj.sort(arr, n)));
    }
}
