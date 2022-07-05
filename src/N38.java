public class N38 {
    public String countAndSay(int n) {
        String res = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int j = 0;
            while (j < res.length()) {
                char c = res.charAt(j);
                int r = j + 1;
                while (r < res.length() && res.charAt(r) == c) r++;
                sb.append(r - j);
                sb.append(c);
                j = r;
            }
            res = sb.toString();
        }
        return res;
    }
}
