package palindrome_number__LeetCode9

import (
	"algo-journ/algo/leetcode/palindrome_number__LeetCode9"
	"testing"
)

func Test1(t *testing.T) {
	if res := palindrome_number__LeetCode9.PalindromeNumber(121); !res {
		t.Fatalf("Expected %t, got %t", !res, res)
	}
}

func Test2(t *testing.T) {
	if res := palindrome_number__LeetCode9.PalindromeNumber(-121); res {
		t.Fatalf("Expected %t, got %t", !res, res)
	}
}

func Test3(t *testing.T) {
	if res := palindrome_number__LeetCode9.PalindromeNumber(456654); !res {
		t.Fatalf("Expected %t, got %t", !res, res)
	}
}
