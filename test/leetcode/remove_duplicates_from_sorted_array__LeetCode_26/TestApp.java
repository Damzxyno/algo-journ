package leetcode.remove_duplicates_from_sorted_array__LeetCode_26;

import helpers.LinkedListHelper;
import leetcode.remove_duplicates_from_sorted_array__LeetCode26.RemoveDuplicatesFromSortedArraySolution;
import org.junit.Assert;
import org.junit.Test;

public class TestApp {
    private final RemoveDuplicatesFromSortedArraySolution solution = new RemoveDuplicatesFromSortedArraySolution();
    private final LinkedListHelper llh = new LinkedListHelper();
    @Test
    public void test1(){
        var arr = new int []{0,0,1,1,1,2,2,3,3,4};
        var expectedSize = 5;
        var expectedArr = new int [] {0, 1, 2, 3, 4};
        var response = solution.removeDuplicates(arr);
        var message = String.format("Expected %s, got %s.", llh.stringifyArr(expectedArr), llh.stringifyArr(arr));
        Assert.assertEquals(expectedSize, response);
        Assert.assertTrue(message, confirmArr(expectedArr, arr));
    }

    @Test
    public void test2(){
        var arr = new int []{1,1,2};
        var expectedSize = 2;
        var expectedArr = new int [] {1, 2};
        var response = solution.removeDuplicates(arr);
        var message = String.format("Expected %s, got %s.", llh.stringifyArr(expectedArr), llh.stringifyArr(arr));
        Assert.assertEquals(expectedSize, response);
        Assert.assertTrue(message, confirmArr(expectedArr, arr));
    }

    private boolean confirmArr(int [] expected, int [] arr){
        for(var i = 0; i < expected.length; i++){
            if (expected[i] != arr[i]){
                return false;
            }
        }
        return true;
    }
}
