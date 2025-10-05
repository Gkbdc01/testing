        return max;
    }

    public static boolean ispalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
            }
                    max = s.substring(i, j);
                }
                if (ispalindrome(s.substring(i, j)) && max.length() < s.substring(i, j).length()) {
            for (int j = i + 1; j <= s.length(); j++) {
        for (int i = 0; i < s.length(); i++) {
    public String longestPalindrome(String s) {
        String max = "";
class Solution {