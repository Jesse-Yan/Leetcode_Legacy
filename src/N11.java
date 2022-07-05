public class N11 {
    public int maxArea(int[] height) {
        int res = 0;
        int i = 0, j = height.length - 1;
        while (i != j) {
            int l = height[i], r = height[j];
            res = Math.max(Math.min(l, r) * (j - i), res);
            if (l < r) i++;
            else j--;
        }
        return res;
    }
}
