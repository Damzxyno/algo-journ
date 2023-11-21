package two_sum__LeetCode1

func TwoSum(nums []int, target int) []int {
	traceMap := map[int]int{}
	for i, v := range nums {
		if mappedValue, exists := traceMap[v]; exists {
			return []int{mappedValue, i}
		}
		traceMap[target-v] = i
	}
	return []int{}
}
