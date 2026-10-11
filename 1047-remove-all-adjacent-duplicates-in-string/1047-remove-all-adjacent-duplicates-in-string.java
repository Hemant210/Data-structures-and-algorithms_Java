class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> str = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(str.isEmpty() || str.peek() != ch){
                str.push(ch);
            } else {
                str.pop();
            }
        }

        String res = "";
        while(!str.isEmpty()){
            res = str.pop() + res;
        }

        return res;
    }
}