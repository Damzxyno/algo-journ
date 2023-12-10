package leetcode.container_with_most_water__LeetCode_11;

public class ContainerWithMostWaterSolution {
    public int maxArea(int[] height) {
        var max = 0;
        int i = 0, j = height.length - 1;
        while (i < j){
            max = Math.max(max, getArea(height, i, j));
            if (height[i] > height[j]){
                j--;
            } else {
                i++;
            }
        }
        return max;
    }

    private int getArea (int [] arr, int i, int j){
        if (arr[i] > arr[j]){
            return (j - i) * arr[j];
        }
        return (j - i) * arr[i];
    }
}
