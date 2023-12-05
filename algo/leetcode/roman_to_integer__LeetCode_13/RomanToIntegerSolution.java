package leetcode.roman_to_integer__LeetCode_13;

import java.util.Map;

import static java.util.Map.entry;

public class RomanToIntegerSolution {
    private Map<Character, Integer> map = Map.ofEntries(
            entry('I', 1),
            entry('V', 5),
            entry('X', 10),
            entry('L', 50),
            entry('C', 100),
            entry('D', 500),
            entry('M', 1_000)
    );
    public int romanToInt(String s) {
        var total = 0;
        var sArr = s.toCharArray();
        for (var i = 0; i < sArr.length; i++){
            if (i != sArr.length - 1 && map.get(sArr[i]) < map.get(sArr[i + 1])){
                total -= map.get(sArr[i]);
            } else {
                total += map.get(sArr[i]);
            }
        }
        return total;
    }
}