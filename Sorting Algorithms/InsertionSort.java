import java.util.*;

public class InsertionSort {
    public int[] sort(int[] arr, int n){

        for(int i = 1; i < n; i++){
            for(int j = i; j > 0; j--){
                if (arr[j] >= arr[j-1]) break;
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
        return arr;
    }
}