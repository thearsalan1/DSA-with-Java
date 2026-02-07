package BinarySearch;

public class MaximumCount {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        int neg = firstNonNegative(nums);
        int pos = n - firstPositive(nums);

        return Math.max(neg, pos);
    }

    // Finds index of first element >= 0
    private int firstNonNegative(int[] nums) {
        int lo = 0, hi = nums.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] < 0) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    // Finds index of first element > 0
    private int firstPositive(int[] nums) {
        int lo = 0, hi = nums.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] <= 0) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}