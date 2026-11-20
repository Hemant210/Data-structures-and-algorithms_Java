class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if(words.length != pattern.length()) return false;

        HashMap<Character, String> char_word = new HashMap<>();
        HashMap<String, Character> word_char = new HashMap<>();
        
        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String word = words[i];

            
            if(!char_word.containsKey(c)) char_word.put(c, word);
            if(!word_char.containsKey(word)) word_char.put(word, c);
            if(!char_word.get(c).equals(word) || !word_char.get(word).equals(c)) return false;
        }

        return true;
    }
}