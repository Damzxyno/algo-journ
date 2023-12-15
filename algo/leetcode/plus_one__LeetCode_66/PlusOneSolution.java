package leetcode.plus_one__LeetCode_66;

public class PlusOneSolution {
    public int[] plusOne(int[] digits) {
        if (digits.length < 0){
            return digits;
        }
        digits[digits.length - 1] += 1;

        var rem = 0;
        for (var i = digits.length - 1; i >= 0; i--){
            digits[i] += rem;
            rem = digits[i] / 10;
            digits[i] %= 10;
            if (rem == 0){
                break;
            }
        }

        if (rem > 0){
            var i = 0;
            var result = new int [digits.length + 1];
            result[i] = rem;
            for(var item : digits){
                result[++i] = item;
            }
            return result;
        }
        return digits;
    }
}
