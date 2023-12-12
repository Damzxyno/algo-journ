package leetcode.valid_palindrome__LeetCode_125;

public class ValidPalindromeSolution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int a = 0, b = s.length() - 1;

        while (a < b){
            if (notLetter(s.charAt(a))){
                a++;
            } else if (notLetter(s.charAt(b))){
                b--;
            } else {
                if (s.charAt(a) != s.charAt(b)){
                    return false;
                }
                a++;
                b--;
            }
        }


        return true;
    }

    private boolean notLetter(char a){
        return (a < 'a' || a > 'z') && (a < '0' || a > '9');
    }
}
