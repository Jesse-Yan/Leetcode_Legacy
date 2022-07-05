import java.util.Arrays;

public class N16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = 1000000000;
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int l = i + 1, r = n - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == target) {
                    return target;
                } else {
                    res = Math.abs(sum - target) < Math.abs(res - target) ? sum : res;
                    if (sum > target) {
                        r--;
                        while (r < n - 1 && l < r && nums[r] == nums[r + 1]) r--;
                    } else {
                        l++;
                        while (l > 0 && l < r && nums[l] == nums[l - 1]) l++;
                    }
                }
            }
        }
        return res;
    }
}
