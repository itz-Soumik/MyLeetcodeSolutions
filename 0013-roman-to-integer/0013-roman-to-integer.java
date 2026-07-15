class Solution {
    public int Value(char v) {
        return switch (v) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
    public int romanToInt(String s) {
        int val = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int current = Value(s.charAt(i));
            int next = Value(s.charAt(i+1));
            if (current < next)
                val -= current;
            else
                val += current;
        }
        val += Value(s.charAt(s.length() - 1));
        return val;
    }
}