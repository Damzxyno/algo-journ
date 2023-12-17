package leetcode.permutation__LeetCode_46;

import leetcode.permutations__LeetCode_46.PermutationsSolution;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestApp {
    private final PermutationsSolution solution = new PermutationsSolution();

    @Test
    public void test1(){
        var req = new int [] {1, 2, 3};
        var expected = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 3, 2),
                Arrays.asList(2, 1, 3),
                Arrays.asList(2, 3, 1),
                Arrays.asList(3, 2, 1),
                Arrays.asList(3, 1, 2)
        );
        var resp = solution.permute(req);
        Assert.assertTrue(String.format("Expected %s, but got %s.", expected, resp), arrayListEquals(expected, resp));
    }


    private boolean arrayListEquals(List<List<Integer>> list1, List<List<Integer>> list2){
        for (int i = 0; i < list1.size(); i++){
            for (int j = 0; j < list1.get(i).size(); j++){
                if (!list1.get(i).get(j).equals(list2.get(i).get(j))){
                    return false;
                }
            }
        }
        return true;
    }
}
