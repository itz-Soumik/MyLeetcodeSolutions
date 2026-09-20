class Solution {
    static void reverse(char[] arr, int s, int e) {
        while (s < e) {
            char tmp = arr[s];
            arr[s] = arr[e];
            arr[e] = tmp;
            s++;
            e--;
        }
    }
    static void leftShift(char[] arr, int k) {
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if (s.equals(goal)) return true;
        for (int k = 1; k < s.length(); k++) {
            char[] arr = s.toCharArray();
            leftShift(arr, k);
            if (new String(arr).equals(goal)) return true;
        }
        return false;
    }
}