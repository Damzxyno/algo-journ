package leetcode.length_of_last_word__LeetCode_58;

public class LengthOfLastWordSolution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        var index = s.length() - 1;
        while(index >= 0){
            if (s.charAt(index) == ' ' && count > 0){
                break;
            }
            if (s.charAt(index) != ' '){
                count++;
            }
            index--;
        }
        return count;
    }
}
