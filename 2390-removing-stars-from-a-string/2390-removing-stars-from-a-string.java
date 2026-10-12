class Solution {
    public String removeStars(String s) {
        Stack<Character> str = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '*')
            str.pop();

            else
            str.push(ch);
        }

        StringBuilder sb = new StringBuilder();

        for(char c : str){
            sb.append(c);
        }

        return sb.toString();
    }
}