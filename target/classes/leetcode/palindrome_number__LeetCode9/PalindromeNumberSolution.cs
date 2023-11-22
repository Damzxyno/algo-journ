namespace DefaultNamespace;

public class PalindromeNumberSolution
{
    public bool IsPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        var xC = x;
        var revX = 0;
        while(xC > 0){
            revX *= 10;
            revX += xC % 10;
            xC /= 10;
        }
        return revX == x;
    }
}