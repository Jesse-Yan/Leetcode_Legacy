public class N34 {
    public int[] searchRange(int[] nums, int target) {
        int l = bs(nums, target, true);
        int r = bs(nums, target, false) - 1;
        if (l <= r && r < nums.length && nums[l] == target && nums[r] == target)
            return new int[]{l, r};
        return new int[]{-1, -1};
    }

    private int bs(int[] nums, int target, boolean b) {
        int l = 0, r = nums.length - 1, mid, ans = nums.length;
        while (l <= r) {
            mid = (l + r) / 2;
            if (nums[mid] > target || (b && nums[mid] >= target)) {
                r = mid - 1;
                ans = mid;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}
