package Arrays.Easy;

import java.util.*;

class UnionOfTwoSortedArrays {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> res = new ArrayList<>();
        
        int first = 0;
        int second = 0;
        int n1 = a.length;
        int n2 = b.length;
        while(first < n1 && second < n2){
            if (first < n1 - 1 && a[first] == a[first+1]){
                first++;
                continue;
            }
            if (second < n2 -1 && b[second] == b[second+1]){
                second++;
                continue;
            }
            if (first >= n1 || second >= n2) break;
            
            if (a[first] < b[second]) res.add(a[first++]);
            else if (a[first] > b[second]) res.add(b[second++]);
            else{
                res.add(a[first++]);
                second++;
            }
            
        }
        while(first < n1){
            if (first < n1 - 1 && a[first] == a[first+1]){
                first++;
                continue;
            }
            res.add(a[first++]);
        }
         while(second < n2){
            if (second < n2 - 1 && b[second] == b[second+1]){
                second++;
                continue;
            }
            res.add(b[second++]);
        }
        
        
        return res;
    }
}
