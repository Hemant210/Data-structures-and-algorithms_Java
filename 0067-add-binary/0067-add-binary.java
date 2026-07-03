class Solution {
    public String addBinary(String a, String b) {
        //Time Complexity :- O(n) & Space Complexity :- O(n) 
        // int x = Integer.parseInt(a, 2);
        // int y = Integer.parseInt(b, 2);

        // return Integer.toBinaryString(x + y);

        //Time Complexity :- O(max(m,n)) & Space Complexity :- O(max(m,n))
        StringBuilder ans = new StringBuilder();

        int carry = 0;

        int A = a.length() - 1;
        int B = b.length() - 1;

        while (A >= 0 || B >= 0 || carry != 0) {
            int sum = carry;

            if (A >= 0)
                sum += a.charAt(A--) - '0';

            if (B >= 0)
                sum += b.charAt(B--) - '0';

            ans.append(sum % 2);
            carry = sum / 2;
        }

        return ans.reverse().toString();

    }
}