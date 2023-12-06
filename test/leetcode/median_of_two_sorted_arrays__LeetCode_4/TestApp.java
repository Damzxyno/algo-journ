package leetcode.median_of_two_sorted_arrays__LeetCode_4;

import org.junit.Assert;
import org.junit.Test;

public class TestApp {
    private final MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();

    @Test
    public void test1() {
        var arr1 = new int [] {1, 3};
        var arr2 = new int [] {2};
        var expected = 2.0;
        var response = solution.findMedianSortedArrays(arr1, arr2);
        Assert.assertEquals(expected, response, 1);
    }

    @Test
    public void test2() {
        var arr1 = new int [] {1, 2};
        var arr2 = new int [] {3, 4};
        var expected = 2.5;
        var response = solution.findMedianSortedArrays(arr1, arr2);
        Assert.assertEquals(expected, response, 1);
    }

    @Test
    public void test3() {
        var arr1 = new int [] {1, 3};
        var arr2 = new int [] {2, 7};
        var expected = 2.5;
        var response = solution.findMedianSortedArrays(arr1, arr2);
        Assert.assertEquals(expected, response, 1);
    }
}
