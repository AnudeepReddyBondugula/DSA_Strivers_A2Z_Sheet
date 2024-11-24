import java.util.Arrays;

public class MergeSort {

    public void mergeSort(int[] arr, int left, int right){
        if (left >= right) return;

        int mid = (right + left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);

        int tempArray[] = new int[right + 1];
        for(int i = left; i <= right; i++) tempArray[i] = arr[i];
        int l = left;
        int r = mid+1;
        int idx = left;
        while(l <= mid && r <= right) {
            if (tempArray[l - left] <= tempArray[r]) arr[idx++] = tempArray[l++];
            else arr[idx++] = tempArray[r++];
        }
        while(l <= mid) arr[idx++] = tempArray[l++];
        while(r <= right) arr[idx++] = tempArray[r++];
    }

    public int[] sort(int arr[], int n) {
        mergeSort(arr, 0, n-1);
        return arr;
    }

    public static void main(String[] args) {
        MergeSort obj = new MergeSort();
        int arr[] = {3, 2, 1, 2, 4};
        System.out.println(Arrays.toString(obj.sort(arr, 5)));

    }

}
