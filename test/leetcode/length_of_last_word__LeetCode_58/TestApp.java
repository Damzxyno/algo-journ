package leetcode.length_of_last_word__LeetCode_58;

import org.junit.Assert;
import org.junit.Test;

public class TestApp {
    private final LengthOfLastWordSolution solution = new LengthOfLastWordSolution();

    @Test
    public void test1(){
        var req = "Hello World";
        var expected = 5;
        var res = solution.lengthOfLastWord(req);
        Assert.assertEquals(expected, res);
    }

    @Test
    public void test2(){
        var req = "   fly me   to   the moon  ";
        var expected = 4;
        var res = solution.lengthOfLastWord(req);
        Assert.assertEquals(expected, res);
    }

    @Test
    public void test3(){
        var req = "luffy is still joyboy";
        var expected = 6;
        var res = solution.lengthOfLastWord(req);
        Assert.assertEquals(expected, res);
    }
}
