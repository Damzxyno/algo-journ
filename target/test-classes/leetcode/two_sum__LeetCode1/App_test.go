package main

import (
	code1 "algo-journ/algo/leetcode/two_sum__LeetCode1"
	"testing"
)

func deepEqual(a, b *[]int) bool {
	if len(*a) != len(*b) {
		return false
	}
	for i, v := range *a {
		if v != (*b)[i] {
			return false
		}
	}
	return true
}
func testHelper(nums, result []int, target int, t *testing.T) {
	if res := code1.TwoSum(nums, target); !deepEqual(&res, &result) {
		t.Fatalf("Expected %-v, got %-v", result, res)
	}
}

func Test1(t *testing.T) {
	testHelper([]int{2, 7, 11, 15}, []int{0, 1}, 9, t)
}

func Test2(t *testing.T) {
	testHelper([]int{3, 2, 4}, []int{1, 2}, 6, t)
}

func Test3(t *testing.T) {
	testHelper([]int{3, 3}, []int{0, 1}, 6, t)
}
