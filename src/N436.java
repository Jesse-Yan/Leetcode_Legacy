import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class N436 {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        if (n == 1)
            return new int[]{-1};
        int[] ls = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            ls[i] = intervals[i][0];
            map.put(intervals[i][0], i);
        }
        Arrays.sort(ls);
        for (int i = 0; i < n; i++) {
            if (intervals[i][1] > ls[n - 1]) {
                res[i] = -1;
                continue;
            }
            int l = 0, r = n - 1, mid, target = -1;
            while (l <= r) {
                mid = (l + r) / 2;
                if (ls[mid] >= intervals[i][1]) {
                    target = mid;
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            res[i] = map.get(ls[target]);
        }
        return res;
    }
}
