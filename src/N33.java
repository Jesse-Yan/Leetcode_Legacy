public class N33 {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1, mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (nums[mid] == target)
                return mid;
            if (mid > l && nums[l] <= nums[mid - 1]) {
                if (nums[l] <= target && target <= nums[mid - 1])
                    r = mid - 1;
                else
                    l = mid + 1;
            } else {
                if (mid < r && nums[mid + 1] <= target && target <= nums[r])
                    l = mid + 1;
                else
                    r = mid - 1;
            }
        }
        return -1;
    }
}
