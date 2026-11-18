class Solution {
    public boolean validPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;

        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                return check(s, low + 1, high) || check(s, low, high - 1);
            }

            low++;
            high--;
        }

        return true;
    }

    public boolean check(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(right) != s.charAt(left)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}