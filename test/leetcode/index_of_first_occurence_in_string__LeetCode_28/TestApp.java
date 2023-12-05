package leetcode.index_of_first_occurence_in_string__LeetCode_28;

import org.junit.Assert;
import org.junit.Test;

public class TestApp {
    private final FirstOccurrenceInStringSolution solution = new FirstOccurrenceInStringSolution();

    @Test
    public void test1 (){
        var req = "sadbutsad";
        var needle = "sad";
        var expected = 0;
        var response = solution.strStr(req, needle);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void test2 (){
        var req = "leetcode";
        var needle = "leeto";
        var expected = -1;
        var response = solution.strStr(req, needle);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void test3 (){
        var req = "mississippi";
        var needle = "issipi";
        var expected = -1;
        var response = solution.strStr(req, needle);
        Assert.assertEquals(expected, response);
    }
}
