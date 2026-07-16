class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int area = 0;
        int mArea = 0;
        while (left < right) {
            area = Math.min(height[left], height[right]) * (right - left);
            if (area > mArea) mArea = area;
            if (height[left] < height[right]) left++;
            else right--;
        }
        return mArea;
    }
}