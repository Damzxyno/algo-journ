package leetcode.generate_paranthesis__LeetCode22;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesisSolution {
    public List<String> generateParenthesis(int n) {
        var solution = new ArrayList<String>();
        backtrackParenthesis(solution, "", 0, 0, n);
        return solution;
    }

    private void backtrackParenthesis (List<String> solution, String curr, int opening, int closing, int requiredPair){
        if (curr.length() == requiredPair * 2){
            solution.add(curr);
            return;
        }
        if (opening < requiredPair){
            backtrackParenthesis(solution, curr + "(", opening + 1, closing, requiredPair);
        }
        if(closing < opening){
            backtrackParenthesis(solution, curr + ")", opening, closing + 1, requiredPair);
        }
    }
}
