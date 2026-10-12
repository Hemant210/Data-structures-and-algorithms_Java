class Solution {
    public String removeStars(String s) {
        char[] arr = new char[s.length()];

        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*')
                j--;
            else
                arr[j++] = s.charAt(i);
        }

        return new String(arr, 0, j);
    }
}