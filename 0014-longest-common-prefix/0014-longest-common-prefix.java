class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(i < strs[0].length() && i < strs[strs.length - 1].length()) {
            if (strs[0].charAt(i) != strs[strs.length - 1].charAt(i)) break;
            sb.append(strs[0].charAt(i));
            i++;
        }
        return new String(sb);
    }
}