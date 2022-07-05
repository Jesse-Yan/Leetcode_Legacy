import java.util.HashMap;
import java.util.Map;

public class N464 {
    Map<Integer, Boolean> memo = new HashMap<>();

    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if ((1 + maxChoosableInteger) * maxChoosableInteger / 2 < desiredTotal)
            return false;
        return dfs(maxChoosableInteger, 0, desiredTotal);
    }

    private boolean dfs(int maxChoosableInteger, int usedNum, int desiredTotal) {
        if (!memo.containsKey(usedNum)) {
            boolean res = false;
            for (int i = 0; i < maxChoosableInteger; i++) {
                if (((usedNum >> i) & 1) == 1)
                    continue;
                if (i + 1 >= desiredTotal) {
                    res = true;
                    break;
                }
                if (!dfs(maxChoosableInteger, usedNum | (1 << i), desiredTotal - i - 1)) {
                    res = true;
                    break;
                }
            }
            memo.put(usedNum, res);
        }
        return memo.get(usedNum);
    }
}
