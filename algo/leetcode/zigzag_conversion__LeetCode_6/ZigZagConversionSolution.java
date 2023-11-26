package leetcode.zigzag_conversion__LeetCode_6;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversionSolution {
    public String convert(String s, int numRows) {
        if (numRows <= 1){
            return s;
        }
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 1; i <= numRows; i++){
            list.add(new StringBuilder());
        }
        int tracker = 1;
        boolean forward = true;
        for(var item : s.toCharArray()){
            list.get(tracker - 1).append(item);
            if (tracker == numRows){
                forward = false;
            }
            if (tracker == 1){
                forward = true;
            }
            if (forward){
                tracker++;
            } else {
                tracker--;
            }
        }
        var result = new StringBuilder();
        for (var sb : list){
            result.append(sb.toString());
        }
        return result.toString();
    }
}
