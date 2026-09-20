class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isIncreasing = true, isDecreasing = true;
        for (int i=0;i<nums.length - 1;i++) {
            if(nums[i] > nums[i+1]) isIncreasing = false;
        }
        for (int j=0;j<nums.length - 1;j++) {
            if(nums[j] < nums[j+1]) isDecreasing = false;
        }
        if (isIncreasing || isDecreasing) return true;
        else return false;
    }
}