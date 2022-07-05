public class N31 {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return;
        int r = n - 1, i = n - 2, j = n - 1;
        while (i != -1 && nums[i] >= nums[i + 1]) i--;
        if (i != -1) {
            while (nums[i] >= nums[r]) r--;
            int temp = nums[i];
            nums[i] = nums[r];
            nums[r] = temp;
        }
        i++;
        while (i < j) {
            int temp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = temp;
        }
    }
}
