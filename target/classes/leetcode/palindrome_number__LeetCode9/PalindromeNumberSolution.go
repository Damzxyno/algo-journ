package palindrome_number__LeetCode9

func PalindromeNumber(x int) bool {
	if x < 0 {
		return false
	}
	xCopy := x
	xRev := 0

	for xCopy > 0 {
		xRev *= 10
		xRev += xCopy % 10
		xCopy /= 10
	}
	return xRev == x
}
