class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int n = nums.length - 1;
        reverse(nums, 0, n);
        reverse(nums, 0, k-1);
        reverse(nums, k, n);
    }
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++; end--;
        }
    }
}