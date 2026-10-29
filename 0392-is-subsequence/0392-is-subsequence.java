class Solution {
    public boolean isSubsequence(String s, String t) {
        int st = 0;
        int ts = 0;

        while (st < s.length() && ts < t.length()) {
            if (s.charAt(st) == t.charAt(ts)) {
                st++;
            }

            ts++;
        }
        return st == s.length();

    }

}