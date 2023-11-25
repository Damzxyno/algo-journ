package leetcode.reverse_integer__Leetcode_7;

public class ReverseIntegerSolution {
    public int reverse(int x) {
        long result = 0;
        boolean isNeg = false;
        if (x < 0) {
            isNeg = true;
            x *= -1;
        }

        while (x > 0) {
            result *= 10;
            result += x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE) {
                return 0;
            }
        }

        if (isNeg) {
            result *= -1;
        }

        if (result > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) result;
    }
}