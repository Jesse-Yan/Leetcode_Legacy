public class N6 {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        StringBuilder res = new StringBuilder();
        int t = 2 * numRows - 2, n = s.length();
        for(int i = 0; i < n; i += t)
            res.append(s.charAt(i));
        for(int i = 1; i < numRows - 1; i++) {
            for(int j = 0; j * t + i < n; j += 1) {
                res.append(s.charAt(j * t + i));
                if((j + 1) * t - i < n)
                    res.append(s.charAt((j + 1) * t - i));
            }
        }
        for(int i = numRows - 1; i < n; i += t)
            res.append(s.charAt(i));
        return res.toString();
    }
}
