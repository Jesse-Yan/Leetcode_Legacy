import java.util.ArrayList;
import java.util.List;

public class N17 {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<>();
        String[] letter = new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> res = new ArrayList<>();
        recur(digits, letter, res, new StringBuilder(), 0);
        return res;
    }

    private void recur(String digits, String[] letter, List<String> res, StringBuilder letters, int index) {
        if (digits.length() == index) {
            res.add(letters.toString());
            return;
        }

        String mappedLetters = letter[Integer.valueOf(String.valueOf(digits.charAt(index))) - 2];
        for (int i = 0; i < mappedLetters.length(); i++) {
            letters.append(mappedLetters.charAt(i));
            recur(digits, letter, res, letters, index + 1);
            letters.deleteCharAt(index);
        }
    }
}
