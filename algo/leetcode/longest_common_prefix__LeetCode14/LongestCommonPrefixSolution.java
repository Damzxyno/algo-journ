package leetcode.longest_common_prefix__LeetCode14;

public class LongestCommonPrefixSolution {
    public static void main(String[] args) {
       var sol = new LongestCommonPrefixSolution().longestCommonPrefix(new String[]{"a"});
//        var sol = new LongestCommonPrefixSolution().longestCommonPrefix(new String[]{"a", "ab"});
        System.out.println(sol);
    }
    public String longestCommonPrefix(String[] strs) {
        var lL = Integer.MAX_VALUE;
        for (var item : strs){
            lL = Math.min(lL, item.length());
        }
        var sb = new StringBuilder();
        for(int i = 0; i < lL; i++){
            var curr = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++){
                if (strs[j].charAt(i) != curr){
                    return sb.toString();
                }
            }
            sb.append(curr);
        }
        return sb.toString();
    }
}