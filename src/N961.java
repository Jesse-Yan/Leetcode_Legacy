import java.util.Random;

public class N961 {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        Random r = new Random();
        while (true) {
            int x = r.nextInt(n), y = r.nextInt(n);
            if (x != y && nums[x] == nums[y])
                return nums[x];
        }
    }
}
