public class N5 {
    public String longestPalindrome(String s) {
        String res = "";
        int n = s.length(), l = 0, r = 0, ex;
        for (int i = 0; i < n; i++) {
            ex = expand(s, n, i, i);
            if (ex > r - l) {
                l = i - ex / 2;
                r = i + ex / 2;
            }
            if (i < n - 1 && s.charAt(i) == s.charAt(i + 1)) {
                ex = expand(s, n, i, i + 1);
                if (ex > r - l) {
                    l = i - (ex - 2) / 2;
                    r = i + (ex - 2) / 2 + 1;
                }
            }
        }
        return s.substring(l, r + 1);
    }

    private int expand(String s, int n, int l, int r) {
        while (l - 1 > -1 && r + 1 < n && s.charAt(l - 1) == s.charAt(r + 1)) {
            l--;
            r++;
        }
        return r - l + 1;
    }
}
