class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();

        String str1 = "";
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                str1 += Character.toLowerCase(ch);
            }
        }   

        String str2 = str1;

        StringBuilder sb = new StringBuilder(str1);
        str1 = sb.reverse().toString();

        return str1.equals(str2);
    }
}