import java.util.*;
public class Indices_SubarraySum {

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
         ArrayList<Integer> ls = new ArrayList<>();

        int sum = 0;
        int l = 0;

        for (int r = 0; r < n; r++) {

            sum += arr[r];
            // Shrinking Phase

            while (sum > s && l < r) {
                sum -= arr[l];
                l++;
            }

            if (sum == s) {
                ls.add(l + 1);
                ls.add(r + 1);
                break;
            }

        }

        if (sum!= s) {
            ls.add(-1);}

        return ls;
    }
}