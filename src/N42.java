public class N42 {
    public int trap(int[] height) {
        if (height.length < 3)
            return 0;
        int l = 0, r = height.length - 1, lm = height[l], rm = height[r], ans = 0;
        while (l < r) {
            if (lm < rm) {
                if (height[++l] < lm)
                    ans += lm - height[l];
                else
                    lm = height[l];
            } else {
                if (height[--r] < rm)
                    ans += rm - height[r];
                else
                    rm = height[r];
            }
        }
        return ans;
    }
}
