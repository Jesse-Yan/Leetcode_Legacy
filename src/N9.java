public class N9 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int res = 0, temp = x;
        while (temp != 0) {
            res = res * 10 + temp % 10;
            temp /= 10;
        }
        return x == res;
    }
}
