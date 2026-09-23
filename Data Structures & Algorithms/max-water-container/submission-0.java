class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1;
        int width = right - left, height = Math.min(heights[left], heights[right]),
            maxArea = width * height;
        while (left < right) {
            if (heights[left] <= heights[right]) {
                left++;
            } else {
                right--;
            }
            width = right - left;
            height = Math.min(heights[left], heights[right]);
            maxArea = Math.max(maxArea, width * height);
        }
        return maxArea;
    }
}
