package leetcode.climbing_stairs__LeetCode_70;

public class ClimbingStairsSolution {
    public int climbStairs(int n) {
        int a  = 0;
        int b =  1;
        if (n == 0){
            return 0;
        }
        while (n > 0){
            b += a;
            a = b - a;
            n--;
        }
        return b;
    }
}
