package leetcode.plus_one__LeetCode_66;

import org.junit.Assert;
import org.junit.Test;

public class TestApp {
    private final PlusOneSolution solution = new PlusOneSolution();


    @Test
    public void test1(){
        var req = new int [] {1, 2, 3};
        var expexted = new int [] {1, 2, 4};
        var response = solution.plusOne(req);
        Assert.assertTrue(isEqual(expexted, response));
    }

    @Test
    public void test2(){
        var req = new int [] {4, 3, 2, 1};
        var expexted = new int [] {4, 3, 2, 2};
        var response = solution.plusOne(req);
        Assert.assertTrue(isEqual(expexted, response));
    }


    @Test
    public void test3(){
        var req = new int [] {9};
        var expexted = new int [] {1, 0};
        var response = solution.plusOne(req);
        Assert.assertTrue(isEqual(expexted, response));
    }

    @Test
    public void test4(){
        var req = new int [] {8, 9, 9, 9};
        var expexted = new int [] {9, 0, 0, 0};
        var response = solution.plusOne(req);
        Assert.assertTrue(isEqual(expexted, response));
    }



    private boolean isEqual (int [] a, int [] b){
        if (a.length != b.length){
            return false;
        }

        for (var i = 0; i < a.length; i++){
            if (a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}
