package leetcode.letter_combination_of_a_number__LeetCode_17;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestApp {
    private final LetterCombinationOfATelephoneNumberSolution solution = new LetterCombinationOfATelephoneNumberSolution();


    @Test
    public void test1(){
        var req = "23";
        var expected = new HashSet<>(List.of("ad","ae","af","bd","be","bf","cd","ce","cf"));
        var res = solution.letterCombinations(req);
        Assert.assertEquals(String.format("Expected size = %d, but is %d", expected.size(), res.size()), expected.size(), res.size());
        Assert.assertTrue(String.format("Expected %s, but got %s", expected, res), setEqualList(expected, res));
    }

    @Test
    public void test2(){
        var req = "";
        var expected = new HashSet<String>();
        var res = solution.letterCombinations(req);
        Assert.assertEquals(String.format("Expected size = %d, but is %d", expected.size(), res.size()), expected.size(), res.size());
        Assert.assertTrue(String.format("Expected %s, but got %s", expected, res), setEqualList(expected, res));
    }


    @Test
    public void test3(){
        var req = "2";
        var expected = new HashSet<String>(List.of("a","b","c"));
        var res = solution.letterCombinations(req);
        Assert.assertEquals(String.format("Expected size = %d, but is %d", expected.size(), res.size()), expected.size(), res.size());
        Assert.assertTrue(String.format("Expected %s, but got %s", expected, res), setEqualList(expected, res));
    }



    private boolean setEqualList(Set<String> set, List<String> list){
        for (var item : list){
            if (!set.contains(item)){
                return false;
            }
        }
        return true;
    }
}
