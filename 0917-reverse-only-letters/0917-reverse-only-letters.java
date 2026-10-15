class Solution {
    public String reverseOnlyLetters(String s) {
        char[] str = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (!Character.isLetter(str[left])) {
                left++;
            } else if (!Character.isLetter(str[right])) {
                right--;
            } else {
                char temp = str[right];
                str[right] = str[left];
                str[left] = temp;
                left++;
                right--;
            }
        }

        return new String(str);
    }
}