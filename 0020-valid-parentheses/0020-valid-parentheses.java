class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();   

            for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                // If stack is empty or not matching
                if (st.isEmpty()) return false;

                char top = st.peek();

                if ((top == '(' && ch == ')') ||
                    (top == '{' && ch == '}') ||
                    (top == '[' && ch == ']')) {
                    st.pop(); // Matching pair
                } else {
                    return false; // Not a match
                }
            }
        }

        return st.isEmpty(); // All brackets matched
    }
}