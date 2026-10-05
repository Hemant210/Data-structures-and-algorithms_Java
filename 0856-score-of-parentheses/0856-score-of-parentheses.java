class Solution {
    public int scoreOfParentheses(String s) {
        int ans = 0, cnt = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(')
                cnt++;
            else {
                cnt--;
                if(s.charAt(i-1) == '(')
                    ans += Math.pow(2, cnt);
            }
        }

        return ans;
    }
}