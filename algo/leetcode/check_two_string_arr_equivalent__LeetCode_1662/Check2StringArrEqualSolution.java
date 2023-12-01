package leetcode.check_two_string_arr_equivalent__LeetCode_1662;

public class Check2StringArrEqualSolution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        var sbA = new StringBuilder();
        var sbB = new StringBuilder();
        for (var word : word1){
            sbA.append(word);
        }
        for (var word : word2){
            sbB.append(word);
        }

        return sbA.toString().contentEquals(sbB);
    }
}