import java.util.ArrayList;
import java.util.List;

public class TargetSumTCS {
    public static void main(String[] args) {
        int[] arr = { 3, 4, -7, 1, 3, 3, 1, -4 };
        int targetSum = 7;

        findSubarrayTargetSum(arr, targetSum);
    }

    static void findSubarrayTargetSum(int[] arr, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;

        for (int start = 0; start < n; start++) {
            int currentSum = 0;
            for (int end = start; end < n; end++) {
                currentSum += arr[end];
                if (currentSum == targetSum) {
                    List<Integer> subarray = new ArrayList<>();
                    for (int i = start; i <= end; i++) {
                        subarray.add(arr[i]);
                    }
                    result.add(subarray);
                }
            }
        }

        
        for (List<Integer> subarray : result) {
            System.out.println(subarray);
        }
    }
}
