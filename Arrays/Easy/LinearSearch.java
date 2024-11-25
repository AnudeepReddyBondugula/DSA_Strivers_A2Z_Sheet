package Arrays.Easy;

class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        for(int x : arr) if (k == x) return true;
        return false;
    }
}