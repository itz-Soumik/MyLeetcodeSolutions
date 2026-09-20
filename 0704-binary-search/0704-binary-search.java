class Solution {
    public int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        int idx = -1;
        while(i <= j){
            int mid = i + (j-i) / 2;
            if (target == nums[mid]) {
                idx = mid;
                break;
            }
            else if (target < nums[mid]) j = mid - 1;
            else i = mid + 1;
        }
        return idx;
    }
}