class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;


        HashMap<Character, Character> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char str = s.charAt(i);
            char ctr = t.charAt(i);
            
            if(map.containsKey(str)){
                if(map.get(str) != ctr) return false;
            } else {
                if(map.containsValue(ctr)){
                    return false;
                }

                map.put(str, ctr);
            }
        }

        return true;
    }
}