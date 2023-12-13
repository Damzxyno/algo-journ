package leetcode.letter_combination_of_a_number__LeetCode_17;
import java.util.*;
public class LetterCombinationOfATelephoneNumberSolution {
    public List<String> letterCombinations(String digits) {
        var sol = new ArrayList<String>();
        if (digits.isEmpty()){
            return sol;
        }
        String [] digitMap = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtrack(sol, digitMap, digits, 0, "");
        return sol;
    }


    private void backtrack(
            List<String> sol, String [] digitMap, String digits, int start, String curr){
        if (curr.length() == digits.length()){
            sol.add(curr);
            return;
        }

        var specDigitMap = digitMap[Integer.parseInt(String.valueOf(digits.charAt(start))) - 2];
        for (var i = 0; i < specDigitMap.length(); i++){
            backtrack(sol, digitMap, digits, start + 1, curr + specDigitMap.charAt(i));
        }

    }
}
