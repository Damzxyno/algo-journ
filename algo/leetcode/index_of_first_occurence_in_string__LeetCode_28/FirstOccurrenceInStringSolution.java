package leetcode.index_of_first_occurence_in_string__LeetCode_28;

public class FirstOccurrenceInStringSolution {
    public int strStr(String haystack, String needle) {
        for (var i = 0; i <= haystack.length() - needle.length(); i++){
            if (is(haystack, i, needle)){
                return i;
            }
        }


        return -1;
    }

    private boolean is (String word, int i, String needle){
        for (int j = 0; j < needle.length(); j++){
            if (word.charAt(i) != needle.charAt(j)){
                return false;
            }
            i++;
        }
        return true;
    }
}