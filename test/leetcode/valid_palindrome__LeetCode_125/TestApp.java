package leetcode.valid_palindrome__LeetCode_125;

import org.junit.Assert;
import org.junit.Test;

public class TestApp {
    private final ValidPalindromeSolution solution = new ValidPalindromeSolution();
    @Test
    public void test1(){
         var req = "A man, a plan, a canal: Panama";
         var expected = true;
         var res = solution.isPalindrome(req);
        Assert.assertEquals(expected, res);
    }

    @Test
    public void test2(){
         var req = "race a car";
         var expected = false;
         var res = solution.isPalindrome(req);
        Assert.assertEquals(expected, res);
    }
    @Test
    public void test3(){
         var req = " ";
         var expected = true;
         var res = solution.isPalindrome(req);
        Assert.assertEquals(expected, res);
    }
    @Test
    public void test4(){
         var req = "0P";
         var expected = false;
         var res = solution.isPalindrome(req);
        Assert.assertEquals(expected, res);
    }
}
