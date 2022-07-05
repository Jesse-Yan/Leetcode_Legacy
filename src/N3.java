import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class N3 {
    public int lengthOfLongestSubstring(String s) {
        int res = 0, st = 0;
        Map<Character, Integer> indexes = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer index = indexes.get(c);
            if(index != null && index >= st) {
                res = Math.max(i - st, res);
                st = index + 1;
            }
            indexes.put(c, i);
        }
        return Math.max(res, s.length() - st);
    }

    public int lengthOfLongestSubstring1(String s) {
        Set<Character> visited = new HashSet<>();
        int n = s.length(), r = 0, res = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                visited.remove(s.charAt(i - 1));
            }
            while (r < n && !visited.contains(s.charAt(r))) {
                visited.add(s.charAt(r++));
            }
            res = Math.max(r - i, res);
        }
        return res;
    }
}
