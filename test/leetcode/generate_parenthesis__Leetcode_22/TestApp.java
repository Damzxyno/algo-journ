package leetcode.generate_parenthesis__Leetcode_22;

import leetcode.generate_paranthesis__LeetCode22.GenerateParenthesisSolution;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class TestApp {
    GenerateParenthesisSolution solution = new GenerateParenthesisSolution();

    @Test
    public void test1(){
        var result = solution.generateParenthesis(3);
        var expected = List.of("((()))", "(()())", "(())()", "()(())", "()()()");
        Assert.assertTrue(listEqual(expected, result));
    }


    private boolean listEqual (List<String> a, List<String> b){
        var setA = new HashSet<>(a);
        var setB = new HashSet<>(b);

        for (var item : setA){
            if (!setB.contains(item)){
                return false;
            }
        }
        return true;
    }

}
