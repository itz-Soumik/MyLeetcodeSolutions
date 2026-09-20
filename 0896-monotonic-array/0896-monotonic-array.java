class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isIncreasing = true, isDecreasing = true;
        int i = 0;
        while(i<nums.length - 1) {
            if(nums[i] > nums[i+1]) isIncreasing = false;
            else if(nums[i] < nums[i+1]) isDecreasing = false;
            i++;
        }
        
        if (isIncreasing || isDecreasing) return true;
        else return false;
    }
}