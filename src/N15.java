import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n == 0 || (nums[0] == 0 && nums[n - 1] != 0) || (nums[0] != 0 && nums[n - 1] == 0))
            return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            int a = nums[i], b, c, l = i + 1, r = n - 1;
            if (i > 0 && a == nums[i - 1])
                continue;
            while (l < r) {
                b = nums[l];
                c = nums[r];
                if (a + b + c > 0) {
                    r--;
                } else if (a + b + c < 0) {
                    l++;
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(a);
                    temp.add(b);
                    temp.add(c);
                    res.add(temp);
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r && nums[r] == nums[r + 1]) r--;
                }
            }
        }
        return res;
    }
}
