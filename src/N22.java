import java.util.ArrayList;
import java.util.List;

public class N22 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n == 1) {
            res.add("()");
            return res;
        }
        recur(new StringBuilder(), n, n, res);
        return res;
    }

    private void recur(StringBuilder str, int l, int r, List<String> res) {
        if (l == 0 && r == 0) {
            res.add(str.toString());
            return;
        }

        if (l == r) {
            str.append('(');
            recur(str, l - 1, r, res);
            str.deleteCharAt(str.length() - 1);
        } else {
            if (l != 0) {
                str.append('(');
                recur(str, l - 1, r, res);
                str.deleteCharAt(str.length() - 1);
            }
            str.append(')');
            recur(str, l, r - 1, res);
            str.deleteCharAt(str.length() - 1);
        }
    }
}
