package leetcode.is_valid_paranthesis__LeetCode20;

import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class IsValidParanthesisSolution {
    public boolean isValid(String s) {
        var stack = new Stack<Character>();
        var closingBraces = new HashSet<>(List.of('}', ')', ']'));
        for (var item : s.toCharArray()){
            if (closingBraces.contains(item)){
                if (stack.isEmpty()){
                    return false;
                }
                var stackLast = stack.pop();
                if (!isMatchingPair(stackLast, item)){
                    return false;
                }
            } else {
                stack.push(item);
            }
        }
        return stack.size() == 0;
    }

    public boolean isMatchingPair(char opening, char closing) {
        switch (closing) {
            case '}':
                return opening == '{';
            case ']':
                return opening == '[';
            case ')':
                return opening == '(';
            default:
                return false;
        }
    }
}