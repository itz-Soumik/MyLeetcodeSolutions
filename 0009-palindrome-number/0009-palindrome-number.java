class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || ((x % 10) == 0 && x > 0)) return false;
        int half_reversed = 0;
        while (x > half_reversed){
            half_reversed = (half_reversed * 10) + (x % 10);
            x /= 10;
        }
        return x == half_reversed || x == half_reversed / 10;
    }
}