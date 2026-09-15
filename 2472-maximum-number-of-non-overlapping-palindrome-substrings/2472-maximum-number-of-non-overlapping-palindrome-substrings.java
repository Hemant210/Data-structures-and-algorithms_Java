class Solution {
    public int maxPalindromes(String s, int k) {
        int n = s.length();
        int last = 0;
        int count = 0;

        for (int c = 0; c < n * 2; c++) {
            int left = c / 2;
            int right = left + c % 2;

            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 >= k) {
                    int end = right + 1;

                    if (left >= last) {
                        last = end;
                        count++;
                    } else {
                        last = Math.min(last, end);
                    }

                    break;
                }

                left--;
                right++;
            }
        }

        return count;
    }
}